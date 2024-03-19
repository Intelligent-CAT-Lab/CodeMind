<s> [INST] Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
3 1 4 0 4 1

Expected output:
19

```
c1, c5, c10, c50, c100, c500 = map(int, input().split())
sum = c1 + c5*5 + c10*10 + c50*50 + c100*100 + c500*500
print(1 if sum >= 1000 else 0)

```
[/INST]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] input = new int[6];
        for (int i = 0; i < 6; i++) {
            input[i] = scanner.nextInt();
        }
        int sum = input[0] + input[1] * 5 + input[2] * 10 + input[3] * 50 + input[4] * 100 + input[5] * 500;
        if (sum >= 1000) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}
```</s>
