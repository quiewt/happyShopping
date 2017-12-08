package com.wbz.util;

import org.apache.commons.configuration.Configuration;
import org.apache.commons.configuration.ConfigurationException;
import org.apache.commons.configuration.PropertiesConfiguration;

/**
 * Created by wei on 2017/2/14.
 */
public class ConfigurationUtils {
    private ConfigurationUtils(){}
    private static Configuration configuration = getPropertiesConfig();

    private static Configuration getPropertiesConfig() {
        try {
            configuration = new PropertiesConfiguration("system.properties");
        } catch (ConfigurationException e) {
            e.printStackTrace();
        }
        return configuration;
    }

    public static String getString(String param){
      return  configuration.getString(param);
    }
}

