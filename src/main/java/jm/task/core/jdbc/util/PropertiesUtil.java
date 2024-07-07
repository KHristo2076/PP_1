package jm.task.core.jdbc.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public final class PropertiesUtil {

    private PropertiesUtil() {
    }

    private static final Properties PROPERTIES = new Properties();

    static {
        try {
            LoadProperties();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static String get(String key) {
        return PROPERTIES.getProperty(key);
    }

    private static void LoadProperties() throws IOException {

        try (InputStream resourceAsStream = Properties.class.getClassLoader().getResourceAsStream("application.properties"))
        {
            PROPERTIES.load(resourceAsStream);
        } catch (IOException e){
            throw new RuntimeException(e);
        }
    }


}

