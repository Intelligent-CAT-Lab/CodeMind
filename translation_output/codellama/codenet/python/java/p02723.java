<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

s = input()
if s[2] == s[3] and s[4] == s[5]:
    print("Yes")
else:
    print("No")

Translate the above python code to java.

java code:

[/INST]

Here is the Java code that translates the Python code:

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        if (s.charAt(2) == s.charAt(3) && s.charAt(4) == s.charAt(5)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}</s>
