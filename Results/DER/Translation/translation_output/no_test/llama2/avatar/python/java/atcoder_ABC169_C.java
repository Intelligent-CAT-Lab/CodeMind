<s> Translate the following python code to java and enclose your solution inside ```java```:
```
a , b = input ( ) . split ( )
b = b [ 0 ] + b [ 2 : ]
a = int ( a )
b = int ( b )
print ( a * b // 100 )


```

### Solution

```java
String a, b = input().split(" ");
b = b[0] + b.substring(2);
a = Integer.parseInt(a);
b = Integer.parseInt(b);
System.out.println(a * b / 100);
```
</s>
