<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
100

Expected output:
ABC100


```
s = str(input())
print("ABC"+s)
```
[/INST]
```
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println("ABC" + s);
    }
}
```
This code uses the `Scanner` class to read input from the user, and then uses the `nextLine()` method to read the input as a string. The input is then concatenated with the string "ABC" using the `+` operator, and the resulting string is printed to the console using the `System.out.println()` method.</s>
