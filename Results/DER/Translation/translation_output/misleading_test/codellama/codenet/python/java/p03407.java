<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
50 100 120

Expected output:
4hd

```
A, B, C = map(int, input().split())

if A + B < C:
    print("No")
else:
    print("Yes")
```
[/INST]
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();

        if (A + B < C) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
        }
    }
}
```
Note: The `Scanner` class is used to read input from the user, and the `nextInt()` method is used to read an integer value from the input. The `split()` method is used to split the input into three separate integers. The `map()` method is used to convert the input into integers.</s>
