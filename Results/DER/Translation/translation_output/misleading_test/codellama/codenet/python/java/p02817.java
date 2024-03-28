<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
oder atc

Expected output:
atc!oder

```
S, T = input().split()

print(T + S)
```
[/INST]
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] words = input.split(" ");
        String firstWord = words[0];
        String secondWord = words[1];
        System.out.println(secondWord + " " + firstWord);
    }
}
```
Explanation:

* The `import` statement is used to import the `Scanner` class from the `java.util` package.
* The `Scanner` class is used to read input from the user.
* The `nextLine()` method is used to read a line of input from the user.
* The `split()` method is used to split the input string into two words.
* The `firstWord` and `secondWord` variables are used to store the two words.
* The `System.out.println()` method is used to print the output.

Note: The `System.out.println()` method is used to print the output to the console. If you want to print the output to a file, you can use the `PrintWriter` class instead.</s>
