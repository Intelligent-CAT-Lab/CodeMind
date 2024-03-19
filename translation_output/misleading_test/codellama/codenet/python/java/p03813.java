<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1000

Expected output:
ABC

```
a = int(input())
print('ABC' if a<1200 else 'ARC')
```
[/INST]
```
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a < 1200) {
            System.out.println("ABC");
        } else {
            System.out.println("ARC");
        }
    }
}
```
This code uses the `Scanner` class to read input from the user, and then uses an `if` statement to check if the input is less than 1200. If it is, it prints "ABC", otherwise it prints "ARC".</s>
