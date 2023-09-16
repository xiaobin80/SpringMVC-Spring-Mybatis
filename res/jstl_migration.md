jstl Migration
===============
jstl1.2 migrate to Jakarta Standard Tag Library

The JSTL 1.2 Maintenace Release aligns 
with the Unified Expression Language (EL) that is being delivered as part of the JavaServer Pages (JSP) 2.1 specification.

## maven change
[jstl](https://www.oracle.com/java/technologies/java-server-tag-library.html): JavaServer Pages Standard Tag Library

### jstl1.2
```
<!-- https://mvnrepository.com/artifact/javax.servlet/jstl -->
<dependency>
    <groupId>javax.servlet</groupId>
    <artifactId>jstl</artifactId>
    <version>1.2</version>
</dependency>
```
### Jakarta Standard Tag Library
- API
```
<!-- https://mvnrepository.com/artifact/jakarta.servlet.jsp.jstl/jakarta.servlet.jsp.jstl-api -->
<dependency>
    <groupId>jakarta.servlet.jsp.jstl</groupId>
    <artifactId>jakarta.servlet.jsp.jstl-api</artifactId>
    <version>3.0.0</version>
</dependency>
```
- impl
```
<!-- https://mvnrepository.com/artifact/org.glassfish.web/jakarta.servlet.jsp.jstl -->
<dependency>
    <groupId>org.glassfish.web</groupId>
    <artifactId>jakarta.servlet.jsp.jstl</artifactId>
    <version>3.0.1</version>
</dependency>
```

## code change
JSTL 1.2 is part of the Java EE 5 platform.

### jstl1.2
- core
```
<%@ taglib prefix="c"      uri="http://java.sun.com/jsp/jstl/core" %>
```
- I18N capable formatting
```
<%@ taglib prefix="fmt"    uri="http://java.sun.com/jsp/jstl/fmt" %>
```

### Jakarta Standard Tag Library
- core
```
<%@ taglib prefix="c"      uri="jakarta.tags.core" %>
```
- I18N capable formatting
```
<%@ taglib prefix="fmt"    uri="jakarta.tags.fmt" %>
```


### 1.2. Multiple Tag Libraries
|Functional Area | URI |Prefix|
|-|-|-|
|core| jakarta.tags.core |c|
|XML processing| jakarta.tags.xml |x|
|I18N capable formatting| jakarta.tags.fmt |fmt|
|relational db access (SQL)| jakarta.tags.sql |sql|
|Functions| jakarta.tags.functions |fn|


# Ref
- [Jakarta Standard Tag Library 3.0](https://jakarta.ee/zh/specifications/tags/3.0/)
- [Jakarta Standard Tag Library 3.0 Specification Document (PDF)](https://jakarta.ee/zh/specifications/tags/3.0/jakarta-tags-spec-3.0.pdf)
- [BalusC](https://stackoverflow.com/a/4928309)
- [Migration to Jakarta EE: Unable to find taglib "c" for URI](https://stackoverflow.com/questions/74585710/migration-to-jakarta-ee-unable-to-find-taglib-c-for-uri-jakarta-tags-core)
