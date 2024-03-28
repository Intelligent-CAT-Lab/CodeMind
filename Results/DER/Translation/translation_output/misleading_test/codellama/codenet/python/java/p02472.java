<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
5 8

Expected output:
105

```
A,B=[int(i) for i in input().split(" ")]
print(A+B)


```
[/INST]
```
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        System.out.println(A + B);
    }
}
```
This code uses the `Scanner` class to read input from the user, and then uses the `nextInt()` method to read the two integers and store them in the variables `A` and `B`. Finally, it prints the sum of `A` and `B` using the `println()` method.

Note that the `Scanner` class is used to read input from the user, and the `nextInt()` method is used to read the next integer from the input stream. The `println()` method is used to print the result to the console.</s>
