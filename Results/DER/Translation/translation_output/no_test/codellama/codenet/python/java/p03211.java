<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

S=str(input())
a=99999
for i in range(len(S)-2):
  a=min(abs(753-int(S[i]+S[i+1]+S[i+2])),a)
  
print(a)

Translate the above python code to java.

java code:

[/INST]

Here is the Java code equivalent to the Python code:
```
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.nextLine();
        int a = 99999;
        for (int i = 0; i < S.length() - 2; i++) {
            a = Math.min(Math.abs(753 - Integer.parseInt(S.substring(i, i + 3))), a);
        }
        System.out.println(a);
    }
}
```
Note that the `Scanner` class is used to read input from the user, and the `Math.min` method is used to find the minimum value of two numbers. The `Math.abs` method is used to find the absolute value of a number. The `Integer.parseInt` method is used to convert a string to an integer.</s>
