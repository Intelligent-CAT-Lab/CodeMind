<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

K, X = list(map(int, input().split()))
print("Yes" if 500*K>=X else "No")


Translate the above python code to java.

java code:

[/INST]

Here is the Java code that translates the Python code:

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        int X = sc.nextInt();
        if (500 * K >= X) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}

This code uses the `Scanner` class to read input from the user, and then uses the `if` statement to check if the condition `500 * K >= X` is true. If it is, it prints "Yes" to the console, otherwise it prints "No".</s>
