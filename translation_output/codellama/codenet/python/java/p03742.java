<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

# coding: utf-8
a,b=map(int,input().split())
print('Alice' if abs(a-b)>1 else 'Brown')

Translate the above python code to java.

java code:

[/INST]

Here is the Java code that translates the Python code:

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (Math.abs(a - b) > 1) {
            System.out.println("Alice");
        } else {
            System.out.println("Brown");
        }
    }
}

Note that the Java code uses the `Scanner` class to read input from the user, and the `Math.abs()` method to calculate the absolute value of the difference between `a` and `b`.</s>
