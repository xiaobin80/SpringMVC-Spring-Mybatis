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
        

Step 1:    
```bash
mvn package -DskipTests
```

Step 2:       
    http://localhost:8080/carnumberJSP2/view/trainOrder.do    
    http://localhost:8080/carnumberJSP2/cust/list    
    http://localhost:8080/carnumberJSP2/cust/insert   
    http://localhost:8080/carnumberJSP2/cust/update/{id}    
    http://localhost:8080/carnumberJSP2/cust/del/{id}    
    http://localhost:8080/carnumberJSP2/login    
