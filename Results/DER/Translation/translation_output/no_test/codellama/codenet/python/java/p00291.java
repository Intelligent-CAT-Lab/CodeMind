<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

c1, c5, c10, c50, c100, c500 = map(int, input().split())
sum = c1 + c5*5 + c10*10 + c50*50 + c100*100 + c500*500
print(1 if sum >= 1000 else 0)


Translate the above python code to java.

java code:

[/INST]

Here is the Java code that translates the Python code:

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c1 = sc.nextInt();
        int c5 = sc.nextInt();
        int c10 = sc.nextInt();
        int c50 = sc.nextInt();
        int c100 = sc.nextInt();
        int c500 = sc.nextInt();
        int sum = c1 + c5*5 + c10*10 + c50*50 + c100*100 + c500*500;
        if (sum >= 1000) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}

Note that the Java code uses the `Scanner` class to read input from the user, and the `System.out.println()` method to print output to the console. The `if` statement is used to check if the sum is greater than or equal to 1000, and the `else` statement is used to print 0 if the sum is less than 1000.</s>
