<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
rng gorilla apple

Expected output:
YS

```
a, b, c = input().split()

if a[-1] == b[0] and b[-1] == c[0]:
    print('YES')
else:
    print('NO')


```
[/INST]
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] words = input.split(" ");
        if (words[0].charAt(words[0].length() - 1) == words[1].charAt(0) && words[1].charAt(words[1].length() - 1) == words[2].charAt(0)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
```
Explanation:

* The `import` statement is used to import the `Scanner` class from the `java.util` package.
* The `Scanner` class is used to read input from the user.
* The `nextLine()` method is used to read a line of input from the user.
* The `split()` method is used to split the input string into an array of strings, where each string represents a word.
* The `charAt()` method is used to get the character at a specific index in a string.
* The `length()` method is used to get the length of a string.
* The `if` statement is used to check if the first character of the first word is equal to the last character of the second word, and if the last character of the second word is equal to the first character of the third word.
* The `print()` method is used to print the output to the console.

Sample test case:

Input:
rng gorilla apple

Output:
YES</s>
