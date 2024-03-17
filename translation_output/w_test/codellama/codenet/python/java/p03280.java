<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
2 2

Expected output:
1


```
a,b = map(int,input().split())
print((a-1)*(b-1))
```
[/INST]
```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println((a-1)*(b-1));
    }
}
```
This code uses the `Scanner` class to read input from the user, and then uses the `nextInt()` method to read the two integers `a` and `b`. It then calculates the product of `a-1` and `b-1` and prints the result to the console using the `println()` method.

Note that the `Scanner` class is used to read input from the user, and the `nextInt()` method is used to read the input as an integer. The `println()` method is used to print the result to the console.</s>
