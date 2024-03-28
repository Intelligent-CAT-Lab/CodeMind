<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1 2 3

Expected output:
3 1 2


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
```
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] tokens = input.split(" ");
        int X = Integer.parseInt(tokens[0]);
        int Y = Integer.parseInt(tokens[1]);
        int Z = Integer.parseInt(tokens[2]);

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
This code uses the `Scanner` class to read input from the user, and the `split()` method to split the input string into an array of strings. The `parseInt()` method is used to convert the strings to integers.

The code then uses the `A`, `B`, and `C` variables to store the values of `X`, `Y`, and `Z`, respectively. It then performs the required swapping of values using the `B` and `C` variables. Finally, it prints the values of `A`, `B`, and `C` using the `System.out.println()` method.

Note that this code assumes that the input will be a string of three integers separated by spaces. If the input is not in this format, the code may not work correctly.</s>
