System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
3 1

Expected output:
4


```
a,b=map(int,input().split())
print(max(a+b,a-b,a*b))
```


Answer:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int result = Math.max(a + b, Math.max(a - b, a * b));
        System.out.println(result);
    }
}
```

Test input:
```
3 1
```

Expected output:
```
4
```<|endoftext|>
