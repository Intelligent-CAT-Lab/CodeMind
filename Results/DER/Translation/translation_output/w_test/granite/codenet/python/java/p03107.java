System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
0011

Expected output:
4


```
A = list(input())
N = len(A)

C0 = A.count("0")
C1 = A.count("1")

print(2 * min(C0, C1))

```


Answer:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int N = input.length();

        int C0 = 0;
        int C1 = 0;

        for (int i = 0; i < N; i++) {
            if (input.charAt(i) == '0') {
                C0++;
            } else {
                C1++;
            }
        }

        System.out.println(2 * Math.min(C0, C1));
    }
}
```

Test input:
0011

Expected output:
4<|endoftext|>
