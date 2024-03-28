<s> [INST] Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
20

Expected output:
15800


```
N = int(input())
print(800*N-200*(N//15))
```
[/INST]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int result = 800*N - 200*(N/15);
        System.out.println(result);
    }
}
```</s>
