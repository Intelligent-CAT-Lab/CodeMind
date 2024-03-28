<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
AtCoder Beginner Contest

Expected output:
ABC


```
A,x,C=input().split()
print("A"+x[0]+"C")

```
[/INST]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] tokens = input.split(" ");
        String A = tokens[0];
        String x = tokens[1];
        String C = tokens[2];
        System.out.println(A + x.charAt(0) + C);
    }
}
```

Explanation:

* The `Scanner` class is used to read input from the console.
* The `nextLine()` method is used to read a line of input from the console.
* The `split()` method is used to split the input string into three parts based on the space character.
* The `charAt()` method is used to get the first character of the second string.
* The `System.out.println()` method is used to print the output.

Note: The `charAt()` method returns a `char` value, which is a single character. In this case, we are using it to get the first character of the second string, which is the letter "A".</s>
