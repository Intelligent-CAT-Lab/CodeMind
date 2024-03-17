<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
atcoder beginner contest

Expected output:
ABC


```
s1,s2,s3=input().upper().split()
print(s1[0]+s2[0]+s3[0])
```
[/INST]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] words = input.split(" ");
        String s1 = words[0].toUpperCase();
        String s2 = words[1].toUpperCase();
        String s3 = words[2].toUpperCase();
        System.out.println(s1.charAt(0) + s2.charAt(0) + s3.charAt(0));
    }
}
```
Explanation:

* The `import` statement is used to import the `Scanner` class from the `java.util` package.
* The `Scanner` class is used to read input from the user.
* The `nextLine()` method is used to read a line of input from the user.
* The `split()` method is used to split the input string into an array of strings, using a space as the delimiter.
* The `toUpperCase()` method is used to convert each word to uppercase.
* The `charAt()` method is used to get the first character of each word.
* The `System.out.println()` method is used to print the result to the console.

Note: The `Scanner` class is used to read input from the user, but it is not the only way to read input in Java. Other ways to read input include using the `BufferedReader` class, or using the `System.in` stream directly.</s>
