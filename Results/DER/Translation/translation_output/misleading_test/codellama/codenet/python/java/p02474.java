<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
5 8

Expected output:
19

```
a=raw_input().split()
print(int(a[0])*int(a[1]))


```
[/INST]
```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        int a = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[1]);
        System.out.println(a * b);
    }
}
```
This code uses the `Scanner` class to read input from the user, and the `split()` method to split the input into two numbers. The `parseInt()` method is used to convert the input strings to integers, and the multiplication is performed using the `*` operator. Finally, the result is printed to the console using the `println()` method.</s>
