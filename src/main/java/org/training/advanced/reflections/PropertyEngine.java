package org.training.advanced.reflections;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.lang.reflect.Field;
import java.util.Properties;

public class PropertyEngine {

    public static void readProperty(Object instance) {
        try {
            Properties properties = new Properties();
            Class<?> aClass = instance.getClass();
            Property annotation = aClass.getAnnotation(Property.class);
            if (annotation != null) {
                File file = new File(annotation.file());
                FileInputStream fileInputStream = null;
                fileInputStream = new FileInputStream(file);
                properties.load(fileInputStream);
                Field[] declaredFields = aClass.getDeclaredFields();
                for (Field f : declaredFields) {
                    f.setAccessible(true);
                    String name = f.getName();
                    String propKey = annotation.prefix() + "." + name;
                    String property = properties.getProperty(propKey);
                    if (property != null) {
                        Class<?> fieldType = f.getType();
                        if (fieldType.getName()
                                     .equals(String.class.getName())) {
                            f.set(instance,
                                  property);
                        } else if (fieldType.getName()
                                            .equals(Integer.class.getName())) {
                            f.set(instance,
                                  Integer.parseInt(property));
                        } else if (fieldType.getName()
                                            .equals("int")) {
                            f.setInt(instance,
                                  Integer.parseInt(property));
                            }
                    }
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
            System.exit(0);
        }

    }

}
