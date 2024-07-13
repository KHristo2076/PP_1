package jm.task.core.jdbc.dao;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.util.Util;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import javax.persistence.criteria.CriteriaQuery;
import java.util.List;

public class UserDaoHibernateImpl implements UserDao {
    private SessionFactory sessionFactory;

    public UserDaoHibernateImpl() {
        this.sessionFactory = Util.getSessionFactory();
    }

    @Override
    public void createUsersTable() {
        Session session = sessionFactory.openSession();
        Util.commit(session, () -> session.createSQLQuery(Util.format("CREATE TABLE IF NOT EXISTS Users (%s, %s, %s, %s)",
                "id INT AUTO_INCREMENT PRIMARY KEY",
                "name VARCHAR(100)",
                "lastName VARCHAR(100)",
                "age TINYINT")).executeUpdate());
    }

    @Override
    public void dropUsersTable() {
        Session session = sessionFactory.openSession();
        Util.commit(session, () -> session.createSQLQuery("DROP TABLE IF EXISTS Users"));
    }

    @Override
    public void saveUser(String name, String lastName, byte age) {
        Session session = sessionFactory.openSession();
        Util.commit(session, () -> session.save(User.builder().name(name).lastName(lastName).age(age).build()));
    }

    @Override
    public void removeUserById(long id) {
        Session session = sessionFactory.openSession();
        Util.commit(session, () -> session.delete(session.get(User.class, id)));
    }

    @Override
    public List<User> getAllUsers() {
        try (Session session = sessionFactory.openSession()) {
            CriteriaQuery<User> criteriaQuery = session.getCriteriaBuilder().createQuery(User.class);
            criteriaQuery.from(User.class);
            return  session.createQuery(criteriaQuery).getResultList();
        }
    }

    @Override
    public void cleanUsersTable() {
        Session session = sessionFactory.openSession();
        Util.commit(session, () -> session.createSQLQuery("TRUNCATE TABLE Users"));
    }
}