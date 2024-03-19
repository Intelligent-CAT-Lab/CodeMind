<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
atcoder beginner contest

Expected output:
AWBC

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
        String firstLetter = words[0].substring(0, 1).toUpperCase();
        String secondLetter = words[1].substring(0, 1).toUpperCase();
        String thirdLetter = words[2].substring(0, 1).toUpperCase();
        System.out.println(firstLetter + secondLetter + thirdLetter);
    }
}
```
Explanation:

* We first import the `Scanner` class from the `java.util` package, which allows us to read input from the user.
* We then create a new `Scanner` object and use its `nextLine()` method to read a line of input from the user.
* We then split the input string into three words using the `split()` method, and store the resulting array of strings in a variable called `words`.
* We then extract the first letter of each word using the `substring()` method, and convert it to uppercase using the `toUpperCase()` method.
* Finally, we print the concatenation of the first letters of the three words, using the `+` operator to concatenate the strings.

Note that this code assumes that the input string will always contain three words separated by spaces. If the input string contains fewer or more than three words, the code will not work correctly.</s>
