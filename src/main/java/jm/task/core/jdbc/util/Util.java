package jm.task.core.jdbc.util;

import java.io.IOException;
import java.io.InputStream;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class Util {
    private static Connection conn = null;
    private static Util instance = null;

    private Util() {
        try {
            if (null == conn || conn.isClosed()) {
                conn = DriverManager
                        .getConnection("jdbc:mysql://localhost:3306/my_db_test",
                                    "root",
                                    "Se#Go*Go98/");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static Util getInstance() {
        if (null == instance) {
            instance = new Util();
        }
        return instance;
    }

    public Connection getConnection() {
        return conn;
    }

    private static Properties getProps() throws IOException {
        Properties props = new Properties();
        try (InputStream in = Files.newInputStream(Paths.get(Util.class.getResource("application.properties").toURI()))) {
            props.load(in);
            return props;
        } catch (IOException | URISyntaxException e) {
            throw new IOException("Database config file not found", e);
        }
    }
}
