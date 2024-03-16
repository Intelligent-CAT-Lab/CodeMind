<s> Translate the following python code to java and enclose your solution inside ```java```:
```
X = int ( input ( ) )
i = 1
a = 0
while True :
    a = a + X
    if a % 360 == 0 :
        print ( i )
        break
    i += 1


```

### Solution

```java
int X = Integer.parseInt(input());
int i = 1;
int a = 0;
while (true) {
    a = a + X;
    if (a % 360 == 0) {
        System.out.println(i);
        break;
    }
    i++;
}
```
</s>
