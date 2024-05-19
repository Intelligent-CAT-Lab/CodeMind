System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
8 6

Expected output:
16


```
x,y=map(int,input().split())
print(x if x%y else -1)
```


Answer:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int result = x % y == 0? -1 : x;
        System.out.println(result);
    }
}
```

Test input:
```
8 6
```

Expected output:
```
16
```<|endoftext|>
