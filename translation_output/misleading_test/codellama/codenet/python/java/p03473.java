<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
21

Expected output:
39

```
M = int(input())
print(48-M)
```
[/INST]
```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        System.out.println(48 - M);
    }
}
```
This code uses the `Scanner` class to read input from the user, and then uses the `nextInt()` method to read an integer value from the input. The `48 - M` expression calculates the difference between 48 and the input value, and the `println()` method is used to print the result to the console.</s>
