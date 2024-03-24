SpringMVC Spring Mybatis
===============

Data for "train Order" See [data](https://github.com/xiaobin80/hlr_servlet/tree/v1.3/data).    
    
.        
|____src        
| |____main        
| | |____java        
| | | |____com.tdtc.carnumber        
| | |____resources        
| | |        
| | |____webapp        
| | | |____images       
| | | |____WEB-INF        
| | | |____index.html        
|____pom.xml        
        

# Deployment
- JDK 17
- Jakarta EE 10    
Tomcat v10.1.x & Jetty v12.0.x

## Step 1: Gen War
```bash
mvn package -DskipTests
```

## Step 2: Run web site
    http://localhost:8080/carnumberJSP2/view/trainOrder.do    
- [login](http://localhost:8080/carnumberJSP2/login)    
    http://localhost:8080/carnumberJSP2/cust/list
- cust(CURD)    
http://localhost:8080/carnumberJSP2/cust/insert    
http://localhost:8080/carnumberJSP2/cust/update/{id}    
http://localhost:8080/carnumberJSP2/cust/del/{id}    


# JAVA non-8 Support
- &#10004; Current LTS
- &#9744; Non-LTS
- &#9745; Outdated LTS

|[class file version](https://en.wikipedia.org/wiki/Java_class_file#General_layout)|[JDK version](https://www.oracle.com/java/technologies/java-se-support-roadmap.html)|LTS|
|-|-|-|
|48|1.4| &#9745; |
|49|5.0| &#9745; |
|50|6.0| &#9745; |
|51|7.0| &#9745; |
|52|8.0| :heavy_check_mark: |
|55|11.0| :heavy_check_mark: |
|61|17.0| :heavy_check_mark: |
|62|18.0| :white_large_square: |
|63|19.0| :white_large_square: |
|64|20.0| :white_large_square: |
|65|21.0| :heavy_check_mark: |


## Components
> There is currently a supported list, but we haven't updated it.

|JDK Version|Component Version|
|-|-|
|11+|[HikariCP v5.0+](https://github.com/brettwooldridge/HikariCP/commit/1991355e6b20be04be2b2d9ff816c32c38937fd2)|
|17+|[Spring Boot v3.0+](https://spring.io/blog/2021/09/02/a-java-17-and-jakarta-ee-9-baseline-for-spring-framework-6)|
|17+|[Thymeleaf 3.1+](https://www.thymeleaf.org/doc/articles/thymeleaf31whatsnew.html)|
