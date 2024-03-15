<s> [INST] Translate the following python code to java and enclose your solution inside ```java```:
```
N,A,B = map(int,input().split())
print(min(A,B),max(A+B-N,0))
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
        int minA = Math.min(A, B);
        int maxA = Math.max(A + B - N, 0);
        System.out.println(minA, maxA);
    }
}
```</s>
