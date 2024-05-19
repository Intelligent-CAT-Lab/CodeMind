System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
80 970

Expected output:
80


```
a, b = map ( int, input ( ). split ( ) )
x = a
h = 0
s = 0
while x > 0 :
    x -= 1
    h += 1
    s += 1
while s // b!= 0 :
    h += 1
    s = s - b + 1
print ( h )


```


Answer:
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int x = a;
        int h = 0;
        int s = 0;
        while (x > 0) {
            x -= 1;
            h += 1;
            s += 1;
        }
        while (s / b!= 0) {
            h += 1;
            s = s - b + 1;
        }
        System.out.println(h);
    }
}
```

Test input:
```
80 970
```

Expected output:
```
80
```<|endoftext|>
