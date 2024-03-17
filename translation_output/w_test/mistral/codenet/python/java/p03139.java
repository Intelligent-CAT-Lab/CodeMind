<s> [INST] Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
10 3 5

Expected output:
3 0


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
        System.out.println(Math.min(A, B) + ", " + Math.max(A + B - N, 0));
    }
}
```</s>
