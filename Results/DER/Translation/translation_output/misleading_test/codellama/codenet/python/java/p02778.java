<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
sardine

Expected output:
xxxxxxx

```
ni = lambda: int(input())
nm = lambda: map(int, input().split())
nl = lambda: list(map(int, input().split()))

s = input()

for i in range(len(s)):
  print('x',end='')
```
[/INST]
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        for (int i = 0; i < s.length(); i++) {
            System.out.print("x");
        }
    }
}
```
This code uses the `Scanner` class to read input from the user, and the `String` class to manipulate the input string. The `for` loop iterates over the characters in the string and prints an "x" character for each one. The `System.out.print()` method is used to print the "x" characters to the console.</s>
