Spring-security Migration
===============

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
```

# Ref
- [Spring security 4.2.X documentation has bug under the title "Form and Basic Login Options"](https://github.com/spring-projects/spring-security/issues/4470)
