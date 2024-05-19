System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
6

Expected output:
4

```
#ABC056-C
x = int(input())

#2æ¬¡æ¹ç¨å¼ãè§£ã
t = int((-1+(1+8*x)**0.5)//2)

if t * (t+1) // 2 >= x:
    print(t)
else:
    print(t+1)
```


Answer:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int t = (int)Math.floor((-1 + Math.sqrt(1 + 8 * x)) / 2);
        if (t * (t + 1) / 2 >= x) {
            System.out.println(t);
        } else {
            System.out.println(t + 1);
        }
    }
}
```

Test input:
```
6
```

Expected output:
```
4
```<|endoftext|>
