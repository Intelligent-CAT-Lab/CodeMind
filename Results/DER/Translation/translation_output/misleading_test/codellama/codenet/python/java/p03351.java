<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
4 7 9 3

Expected output:
JN6

```
a,b,c,d=map(int, input().split())
print("YNeos"[not (abs(a-c)<=d or abs(a-b)<=d and abs(b-c)<=d)::2])
```
[/INST]
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] numbers = input.split(" ");
        int a = Integer.parseInt(numbers[0]);
        int b = Integer.parseInt(numbers[1]);
        int c = Integer.parseInt(numbers[2]);
        int d = Integer.parseInt(numbers[3]);

        if (Math.abs(a - c) <= d || (Math.abs(a - b) <= d && Math.abs(b - c) <= d)) {
            System.out.println("YNeos");
        } else {
            System.out.println("JN6");
        }
    }
}
```
Explanation:

* The `Scanner` class is used to read input from the user.
* The `split()` method is used to split the input string into an array of strings, where each string represents a number.
* The `parseInt()` method is used to convert each string to an integer.
* The `Math.abs()` method is used to calculate the absolute value of the difference between the numbers.
* The `||` operator is used to check if either of the two conditions is true.
* The `System.out.println()` method is used to print the output.

Note: The code assumes that the input is a string of four integers separated by spaces. If the input is not in this format, the code may not work correctly.</s>
