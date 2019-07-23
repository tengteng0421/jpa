package com.teng.jpa.config;

import org.hibernate.dialect.MySQL5InnoDBDialect;
import org.springframework.stereotype.Component;

@Component
@SuppressWarnings("deprecation")
/**
 * 项目中修改hibernate建表时的编码格式
 * application.properties加入:spring.jpa.properties.hibernate.dialect=com.teng.jpa.config.MysqlConfig
 */
public class MysqlConfig extends MySQL5InnoDBDialect {
    @Override
    public String getTableTypeString() {
        return "ENGINE=InnoDB DEFAULT CHARSET=utf8";
    }
}
