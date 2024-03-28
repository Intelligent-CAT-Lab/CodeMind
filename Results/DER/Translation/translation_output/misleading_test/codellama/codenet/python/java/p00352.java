<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1000 3000

Expected output:
1968

```
a,b=map(int,input().split())
print((a+b)//2)

```
[/INST]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int sum = (a + b) / 2;
        System.out.println(sum);
    }
}
```
This code uses the `Scanner` class to read input from the user, and then uses the `nextInt()` method to read the two integers and store them in the variables `a` and `b`. The sum of the two integers is calculated using the `+` operator, and then the result is divided by 2 using the `/` operator. Finally, the result is printed to the console using the `println()` method.

Note that the `Scanner` class is used to read input from the user, and the `nextInt()` method is used to read the input as an integer. The `println()` method is used to print the result to the console.</s>
