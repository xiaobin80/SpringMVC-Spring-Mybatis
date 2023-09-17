Spring-security Migration
===============

- v5.8(default)    
cn: 拦截设置的URL;    
en: intercept the set URL;
- v6.x(default)    
cn: 拦截所有的URL; 允许设置的URL通过.    
en: Intercept all URLs; allow set URLs to pass.


## configuration
v5.8 migrate to v6.x

### [Anonymous access](https://docs.spring.io/spring-security/reference/servlet/authentication/anonymous.html)
```
Anonymous access to the login page doesn't appear to be enabled. 
This is almost certainly an error. 
Please check your configuration allows unauthenticated access to the configured login page.
```

#### xml
Spring-security.xml:
```
<intercept-url pattern="/login" access="hasRole('ROLE_ANONYMOUS')" />
<intercept-url pattern="/view/**" access="permitAll" />
<intercept-url pattern="/images/**" access="permitAll" />
```

# Ref
- [Spring security 4.2.X documentation has bug under the title "Form and Basic Login Options"](https://github.com/spring-projects/spring-security/issues/4470)
