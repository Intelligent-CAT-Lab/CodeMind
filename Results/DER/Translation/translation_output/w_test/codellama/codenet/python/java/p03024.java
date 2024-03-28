<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
oxoxoxoxoxoxox

Expected output:
YES


```
x=input()
a=0
for i in x:
  if i=='x':
    a+=1
print(["NO","YES"][a<=7])
```
[/INST]
```
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int a = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == 'x') {
                a++;
            }
        }
        System.out.println(a <= 7 ? "YES" : "NO");
    }
}
```
This code uses the `Scanner` class to read a line of input from the user, and then it iterates over the characters in the input string using a `for` loop. For each character, it checks if it is equal to the character 'x', and if so, it increments a counter variable `a`. Finally, it prints "YES" if `a` is less than or equal to 7, and "NO" otherwise.</s>
