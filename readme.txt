springdata是spring提供的操作数据库的框架

spring jpa是springdata的其中一个基于jpa标准操作数据的模块
简化操作持久层的操作, 只需要操作编写接口即可

项目中修改hibernate建表时的编码格式
application.properties加入:spring.jpa.properties.hibernate.dialect=com.teng.jpa.config.MysqlConfig