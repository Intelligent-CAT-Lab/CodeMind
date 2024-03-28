<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
oder atc

Expected output:
atcoder


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
        System.out.println(secondWord + firstWord);
    }
}
```
This code uses the `Scanner` class to read input from the user, and the `split()` method to split the input into two words. It then prints the second word followed by the first word.

Here's an example of how to run this code:
```
$ java Solution
oder atc
atcoder
```</s>
