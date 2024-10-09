# Use-Mybatis-Generator

## 概述

- 这个工程是Mybatis的逆向工程MBG（Mybatis-Generator）的实践



## 使用说明

- `common-defined`模块中自定义了`MySQLCommentGenerator`，是为了解决生成pojo的时候，自动获取数据库表中的中文注释
- `with-java`是使用Java代码配置的方式生成
- `with-maven`是使用maven plugins的方式生成



## 注意事项

- pom.xml文件和配置文件中有很多细节，这是需要注意的地方
- 使用在自己的代码中则需要修改包路径和生成文件的路径等等
