#  custom spring boot starter 

1. 自定义spring boot starter 命名规则<br>
    x-spring-boot-starter 其中x可以替换成自己想要的名字

2. 需要在resources/META-INF/ 目录下创建 spring.factories

```javascript
org.springframework.boot.autoconfigure.EnableAutoConfiguration=com.wendy.springboot.HelloAutoConfigure
```
3. pom 文件引入

```xml

 <properties>
        <jdk.version>1.8</jdk.version>
    </properties>
    <dependencyManagement>
        <dependencies>
            <dependency>
                <!-- Import dependency management from Spring Boot -->
                <groupId>org.springframework.boot</groupId>
                <artifactId>spring-boot-dependencies</artifactId>
                <version>1.5.2.RELEASE</version>
                <type>pom</type>
                <scope>import</scope>
            </dependency>
        </dependencies>
    </dependencyManagement>


    <dependencies>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-autoconfigure</artifactId>
        </dependency>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-configuration-processor</artifactId>
            <optional>true</optional>
        </dependency>
    </dependencies>


```

其中spring-boot-configuration-processor 是用来生成元文件的，以便于在依赖此包时，
可以自动提示

```yaml
spring:
  wendy:
    service:
      enabled: true
      hello: zhangshan
```

4.具体请参考项目
    + hello-spring-boot-starter
    + springboot-starter-test001