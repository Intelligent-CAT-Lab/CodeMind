<s> [INST] Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
7 17 120

Expected output:
181

```
N,A,B=map(int,input().split())

print(min(A*N,B))
```
[/INST]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int result = Math.min(A * N, B);
        System.out.println(result);
    }
}
```</s>
