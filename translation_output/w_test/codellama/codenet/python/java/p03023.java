<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
3

Expected output:
180


```
n = int(input())
s = 180 * (n - 2)
print(s)
```
[/INST]
```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s = 180 * (n - 2);
        System.out.println(s);
    }
}
```
This code first prompts the user to enter an integer value, which is stored in the variable `n`. Then, it calculates the value of `s` by multiplying `180` by the difference between `n` and `2`. Finally, it prints the value of `s` to the console.

Note that the `Scanner` class is used to read input from the user, and the `nextInt()` method is used to read an integer value from the user. The `System.out.println()` method is used to print the value of `s` to the console.</s>
