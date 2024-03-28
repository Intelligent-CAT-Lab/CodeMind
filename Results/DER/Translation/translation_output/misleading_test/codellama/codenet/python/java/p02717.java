<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1 2 3

Expected output:
84 56 -70

```
# ã¹ãã¼ã¹åºåãã®æ´æ°ã®å¥å
X,Y,Z = map(int, input().split())

A=X
B=Y
C=Z

B=X
C=Y
A=Z

print(A,B,C)
```
[/INST]
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] numbers = input.split(" ");
        int X = Integer.parseInt(numbers[0]);
        int Y = Integer.parseInt(numbers[1]);
        int Z = Integer.parseInt(numbers[2]);

        int A = X;
        int B = Y;
        int C = Z;

        B = X;
        C = Y;
        A = Z;

        System.out.println(A + " " + B + " " + C);
    }
}
```
Explanation:

* The `Scanner` class is used to read input from the user.
* The `nextLine()` method is used to read a line of input from the user.
* The `split()` method is used to split the input string into an array of strings, using a space as the delimiter.
* The `parseInt()` method is used to convert each string in the array to an integer.
* The `A`, `B`, and `C` variables are declared and initialized with the values of `X`, `Y`, and `Z`, respectively.
* The values of `B` and `C` are swapped, and the value of `A` is set to the value of `Z`.
* The `System.out.println()` method is used to print the values of `A`, `B`, and `C` to the console, separated by spaces.

Note: The `Scanner` class is used to read input from the user, but it is not necessary to use it in this case. You can also use `System.in.read()` to read input from the user.</s>
