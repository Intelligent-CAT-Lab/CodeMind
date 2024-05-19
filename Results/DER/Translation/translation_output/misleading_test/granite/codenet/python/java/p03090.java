System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
3

Expected output:
2
1 3
2 3
-46

```
N = int(input())

if N % 2 == 0:
    edge = []
    for s in range(1, N + 1):
        ng = N - s + 1
        for t in range(1, N + 1):
            if s >= t or t == ng:
                continue
            edge.append((s, t))
else:
    edge = []
    for s in range(1, N + 1):
        ng = N - s
        for t in range(1, N + 1):
            if s >= t or t == ng:
                continue
            edge.append((s, t))

print(len(edge))
for s, t in edge:
    print(s, t)
```


Answer:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        if (N % 2 == 0) {
            int ng = N;
            for (int s = 1; s <= N; s++) {
                ng--;
                for (int t = 1; t <= N; t++) {
                    if (s >= t || t == ng) {
                        continue;
                    }
                    System.out.println(s + " " + t);
                }
            }
        } else {
            int ng = N - 1;
            for (int s = 1; s <= N; s++) {
                for (int t = 1; t <= N; t++) {
                    if (s >= t || t == ng) {
                        continue;
                    }
                    System.out.println(s + " " + t);
                }
                ng--;
            }
        }
    }
}
```<|endoftext|>
