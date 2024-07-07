package jm.task.core.jdbc.util;

import com.mysql.jdbc.Driver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Util {
    private static Connection conn = null;
    private static Util util = null;

    String URL_KEY = "db.url";
    String USER_KEY = "db.user";
    String PASSWORD_KEY = "db.password";

    private Util() {
        try {
            if (conn == null || conn.isClosed()) {
                conn = DriverManager.getConnection(
                        PropertiesUtil.get(URL_KEY),
                        PropertiesUtil.get(USER_KEY),
                        PropertiesUtil.get(PASSWORD_KEY));

            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

     public static Util getUtil() {

        if (util == null) {
            util = new Util();
        }
        return util;
     }
      public Connection getConnection() {
        return conn;
      }

}
