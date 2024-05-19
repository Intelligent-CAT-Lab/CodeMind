System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
0 5

Expected output:
-70

```
# coding: utf-8
D, N = map(int, input().split())
print(100 ** D * N if N!= 100 else 100 ** D * (N + 1))
```


Answer:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int D = scanner.nextInt();
        int N = scanner.nextInt();
        int result;
        if (N!= 100) {
            result = (int) Math.pow(100, D) * N;
        } else {
            result = (int) Math.pow(100, D) * (N + 1);
        }
        System.out.println(result);
    }
}
```

You can run this code with the following test case:

```
0 5
```

Expected output:
```
-70
```<|endoftext|>
