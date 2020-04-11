#### What's up next?

- What are webjars? https://www.webjars.org/
- Make use of github issue management

#### Deployment related questions

x What about jsp files in WAR?



#### Issues

By Spring Boot Initializr doesn't create a src/main/webapp by default.
This is needed to handle jsp pages (cfr. webapp/WEB-INF/jsp)
If you want to handle jsp pages this dependency is needed as well. 

        <dependency>
            <groupId>org.apache.tomcat.embed</groupId>
            <artifactId>tomcat-embed-jasper</artifactId>
            <scope>provided</scope>
        </dependency> 

Reference for this issue:
https://htr3n.github.io/2018/12/jsp-spring-boot/
