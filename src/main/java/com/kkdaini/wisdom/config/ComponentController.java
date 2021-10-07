package com.kkdaini.wisdom.config;

import com.kkdaini.wisdom.mapper.SysRoleMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;

import javax.sql.DataSource;

/**
 * 专门做一些容器
 */
public class ComponentController {
    @Autowired
    private SysRoleMapper mapper;
    void test(){
        mapper.selectById("");
    }
}
