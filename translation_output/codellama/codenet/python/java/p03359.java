<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

a,b = map(int,input().rstrip().split())
if a>b:
    print(a-1)
else:
    print(a)

Translate the above python code to java.

java code:

[/INST]

Here is the Java code that translates the Python code:

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a > b) {
            System.out.println(a - 1);
        } else {
            System.out.println(a);
        }
    }
}

Note that the Java code uses the `Scanner` class to read input from the user, and the `nextInt()` method to read an integer value. The `if` statement is used to check if `a` is greater than `b`, and the `else` statement is used to print `a` if `a` is not greater than `b`.</s>
