package jm.task.core.jdbc.util;

import jm.task.core.jdbc.model.User;
import lombok.Getter;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.AvailableSettings;
import org.hibernate.cfg.Configuration;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;

public class Util {
    private static Connection connection;
    @Getter
    private static SessionFactory sessionFactory;

    static {
        Configuration configuration = new Configuration();
        Properties properties = new Properties();

        properties.put(AvailableSettings.DRIVER, "com.mysql.cj.jdbc.Driver");
        properties.put(AvailableSettings.URL, "jdbc:mysql://localhost:3306/my_db_test");
        properties.put(AvailableSettings.CURRENT_SESSION_CONTEXT_CLASS, "thread");
        properties.put(AvailableSettings.USER, "root");
        properties.put(AvailableSettings.PASS, "Se#Go*Go98/");

        configuration.setProperties(properties);
        configuration.addAnnotatedClass(User.class);

        final StandardServiceRegistry registry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
        try {
            sessionFactory = new MetadataSources(registry).buildMetadata().buildSessionFactory();
        } catch (Exception ex) {
            StandardServiceRegistryBuilder.destroy(registry);
        }
    }

    public static void commit(Session session, Action action) {
        try (session) {
            session.beginTransaction();
            action.handle();
            session.getTransaction().commit();
        }
    }

    public static Connection getConnection() {
        if(connection != null) return connection;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/my_db_test", "root", "Se#Go*Go98/");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return connection;
    }

    public static boolean execute(String sql, Object... args) {
        boolean result = false;
        if(sql == null || sql.isEmpty()) return false;
        if(args.length > 0) {
            sql = format(sql, args);
        }
        try (PreparedStatement ps = getConnection().prepareStatement(sql)) {
            result = ps.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return result;
    }

    public static PreparedStatement prepared(String sql, Object... args) throws SQLException {
        if(sql == null || sql.isEmpty()) return null;
        sql = format(sql, args);
        return getConnection().prepareStatement(sql);
    }

    public static String format(String s, Object... args) {
        return args.length > 0 ? String.format(s, args) : s;
    }

}