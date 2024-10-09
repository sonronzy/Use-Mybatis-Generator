package com.sonronzy;

import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;

import java.io.File;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;


public class Generator {

    public static void main(String[] args) throws Exception {
        List<String> warnings = new ArrayList<>(2);
        ConfigurationParser cp = new ConfigurationParser(warnings);

        URL resourceUrl = ClassLoader.getSystemResource("withJavaGeneratorConfig.xml");
        File configFile = new File(resourceUrl.getFile());
        Configuration config = cp.parseConfiguration(configFile);

        DefaultShellCallback callback = new DefaultShellCallback(true);

        MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, callback, warnings);
        myBatisGenerator.generate(null);
        System.out.println("代码执行完毕...");
    }
}
