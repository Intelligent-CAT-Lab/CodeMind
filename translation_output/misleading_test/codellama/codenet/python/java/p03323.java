<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
5 4

Expected output:
.bih

```
a,b=map(int,input().split())
if a<9 and b<9:
    print("Yay!")
else:
    print(":(")
```
[/INST]
```
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a < 9 && b < 9) {
            System.out.println("Yay!");
        } else {
            System.out.println(":(");
        }
    }
}
```
Explanation:

* The `import` statement is used to import the `Scanner` class from the `java.util` package.
* The `Scanner` class is used to read input from the user.
* The `nextInt()` method is used to read an integer from the user.
* The `if` statement is used to check if the input is less than 9.
* The `System.out.println()` method is used to print the output.

Note: The `map()` function is not available in Java, so we have to use the `Scanner` class to read the input and convert it to an integer.</s>
