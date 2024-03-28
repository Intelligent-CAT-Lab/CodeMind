<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
25

Expected output:
N:o

```
X = int(input())
if X >= 30:
    print("Yes")
else:
    print("No")
```
[/INST]
```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        if (X >= 30) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
```
Note: The `Scanner` class is used to read input from the user. The `nextInt()` method is used to read an integer value from the user. The `System.out.println()` method is used to print the output to the console.</s>
