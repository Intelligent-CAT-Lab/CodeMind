<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
this is a pen.

Expected output:
THIS IS A PEN. 

```
a=input().upper()
print(a)

```
[/INST]
```
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String output = input.toUpperCase();
        System.out.println(output);
    }
}
```
This code uses the `Scanner` class to read input from the user, and the `toUpperCase()` method to convert the input to uppercase. The `System.out.println()` method is used to print the output to the console.</s>
