<s> Translate the following python code to java and enclose your solution inside ```java```:
```
a = int ( input ( ) )
for i in range ( a , 0 , - 1 ) :
    if a % i == 0 :
        print ( i , end = ' â ' )
        a = i


```

### Solution

```java
int a = Integer.parseInt(input());
for (int i = a; i >= 0; i--) {
    if (a % i == 0) {
        System.out.print(i + " â ");
        a = i;
    }
}
```
</s>
