package org.training.advanced.properties;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadProperty {
    public static void main(String[] args) throws Exception{
        Properties properties = new Properties();
        File file = new File("app.properties");
        FileInputStream fileInputStream = new FileInputStream(file);
        properties.load(fileInputStream);
        AppProperties appProperties = new AppProperties();
        appProperties.setName(properties.getProperty("app.name"));
        appProperties.setDescription(properties.getProperty("app.desc"));
        appProperties.setHost(properties.getProperty("app.host"));
        appProperties.setPort(Integer.parseInt(properties.getProperty("app.port")));
        System.out.println(appProperties);
    }
}
