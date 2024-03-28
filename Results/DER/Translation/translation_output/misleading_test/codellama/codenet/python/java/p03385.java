<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
bac

Expected output:
~B{

```
S=input()
if 'a' in S and 'b' in S and 'c' in S:
    print('Yes')
else:
    print('No')
```
[/INST]
```
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        if (S.contains("a") && S.contains("b") && S.contains("c")) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
```
This code uses the `Scanner` class to read a line of input from the user, and then checks if the line contains all three characters "a", "b", and "c". If it does, it prints "Yes", otherwise it prints "No".</s>
