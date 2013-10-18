PrettyPrinter
=============

Pretty print java object values, similar to ruby inspect.


To call: 
```java
PrettyPrinter.toString(null);
PrettyPrinter.toString(TestClass.class);
PrettyPrinter.toString(new TestClass());
```

sample output
```
null
TestClass[STATIC_FINAL_INT_CONSTANTS=Contant value,staticInt=1]
TestClass[STATIC_FINAL_INT_CONSTANTS=Contant value,staticInt=1,floatValue=3.0,nullObject=null]
```

## Test
`PrettyPrinterTest.java`
