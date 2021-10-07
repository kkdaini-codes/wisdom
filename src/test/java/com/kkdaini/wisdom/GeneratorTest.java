package com.kkdaini.wisdom;

import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.OutputFile;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Collections;

@SpringBootTest
public class GeneratorTest {
    /**
     * 数据源配置
     */
    @Value("${spring.datasource.url}")
    private  String url;
    @Value("${spring.datasource.username}")
    private String username;
    @Value("${spring.datasource.password}")
    private String password;
    private  DataSourceConfig.Builder config = new DataSourceConfig.Builder("jdbc:mysql://localhost:3306/wisdom?characterEncoding=utf8&useSSL=false&serverTimezone=UTC&rewriteBatchedStatements=true", "root", "adminuser");

    @Test
    void testConfig(){
        System.out.println(config);
    }


    //必须指定生成路径,如果第二次生成，则需要在启动类上添加MapperScan,因为这是springboot测试类，
    @Test
    void test(){
        FastAutoGenerator.create(config)
                .globalConfig(
                        (builder)->{
                            builder.author("kkdaini").enableSwagger().fileOverride().outputDir("C:\\Users\\kkdai\\Desktop\\物联\\wisdom\\src\\main\\java");
                        }
                ).packageConfig(
                (builder)->{
                    builder.parent("com.kkdaini.wisdom").entity("bean").service("service").serviceImpl("service.impl").mapper("mapper").pathInfo(Collections.singletonMap(OutputFile.mapperXml,"C:\\Users\\kkdai\\Desktop\\物联\\wisdom\\src\\main\\resources\\mapper"));
                }
                ).strategyConfig(
                (scanner,builder)->{
                    builder.entityBuilder().enableLombok();
                    builder.controllerBuilder().enableRestStyle();
                    builder.serviceBuilder().superServiceClass(IService.class).superServiceImplClass(ServiceImpl.class)
                            .formatServiceFileName("%sService")
                            .formatServiceImplFileName("%sServiceImp");

                }
        ).templateEngine(new FreemarkerTemplateEngine()).execute();
    }
}
