Thymeleaf Migration
===============

## Template Resolver
v3.0 migrate v3.1

### TemplateMode
carnumber-servlet.xml:
- v3.0
```
<property name="templateMode" value="HTML5" />
```
- v3.1
```
<property name="templateMode" value="HTML" />
```

#### Enum Constant - [v3.0](https://www.thymeleaf.org/apidocs/thymeleaf/3.0.0.RELEASE/org/thymeleaf/templatemode/TemplateMode.html)
- CSS 
- HTML 
- HTML5    
Deprecated in 3.0.0. Use HTML instead. Will be REMOVED in 3.1
- JAVASCRIPT 
- LEGACYHTML5    
Deprecated in 3.0.0. Use HTML instead. Will be REMOVED in 3.1
- RAW 
- TEXT 
- VALIDXHTML    
Deprecated in 3.0.0. Use HTML instead. Will be REMOVED in 3.1
- VALIDXML    
Deprecated in 3.0.0. Use XML instead. Will be REMOVED in 3.1
- XHTML    
Deprecated in 3.0.0. Use HTML instead. Will be REMOVED in 3.1
- XML 

#### Enum Constant - [v3.1](https://www.thymeleaf.org/apidocs/thymeleaf/3.1.1.RELEASE/org/thymeleaf/templatemode/TemplateMode.html)
- CSS
- HTML
- JAVASCRIPT
- RAW
- TEXT
- XML


# Ref
- [html5 - Enum](https://www.thymeleaf.org/apidocs/thymeleaf/3.0.1.RELEASE/org/thymeleaf/templatemode/TemplateMode.html#HTML5)
