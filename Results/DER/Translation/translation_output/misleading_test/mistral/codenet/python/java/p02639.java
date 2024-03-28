<s> [INST] Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
0 2 3 4 5

Expected output:
-9

```
x_list = list(map(int, input().split()))
for i in range(5):
    if x_list[i] == 0:
        print(i+1)
```
[/INST]
```java
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] x_list = new int[5];
        for (int i = 0; i < 5; i++) {
            x_list[i] = scanner.nextInt();
        }
        for (int i = 0; i < 5; i++) {
            if (x_list[i] == 0) {
                System.out.println(i + 1);
            }
        }
    }
}
```</s>
