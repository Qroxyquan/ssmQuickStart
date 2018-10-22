package com.qroxy.crud.common;

import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * @desc：
 * @author: Qroxy
 * @QQ：1114031075
 * @时间: 2018/10/22-6:24 PM
 */
public class mbg {



        public static void main(String[] args) throws Exception {
            List<String> warnings = new ArrayList<String>();
            boolean overwrite = true;
            File configFile = new File("MybatisGenerator.xml");
            ConfigurationParser cp = new ConfigurationParser(warnings);
            Configuration config = cp.parseConfiguration(configFile);
            DefaultShellCallback callback = new DefaultShellCallback(overwrite);
            MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config,
                    callback, warnings);
            myBatisGenerator.generate(null);
        }
    }


