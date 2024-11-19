package config;

import enums.Environment;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigManager {

    public static final Properties properties = new Properties();
    public static final Logger logger = LogManager.getLogger(ConfigManager.class);

    static{
        loadProperties();
    }


    private static void loadProperties(){

        try{
            FileInputStream baseConfig = new FileInputStream("src/main/resources/config/config.properties");
            properties.load(baseConfig);
            baseConfig.close();

            //Load The Environment
            Environment env = Environment.valueOf(properties.getProperty("env").toUpperCase());
            String envConfigPath = "src/main/resources/config/" + env.name().toLowerCase() +"-config.properties";

            FileInputStream envConfig = new FileInputStream(envConfigPath);
            properties.load(envConfig);
            envConfig.close();

            logger.info("Configuration loaded for environment " + env);

        } catch (IOException e){
            logger.error("Failed to load Configuration" + e);
            throw new RuntimeException("Configuration Loading process failed");
        }


    }

    public static String getProperty(String key){
        return properties.getProperty(key);
    }

    public static Environment getProperty(String key, String defaultValue){
        return Environment.valueOf(properties.getProperty("env").toUpperCase());
    }
}
