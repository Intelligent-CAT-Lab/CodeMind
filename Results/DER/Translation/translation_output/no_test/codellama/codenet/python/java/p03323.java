<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

a,b=map(int,input().split())
if a<9 and b<9:
    print("Yay!")
else:
    print(":(")

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
        if (a < 9 && b < 9) {
            System.out.println("Yay!");
        } else {
            System.out.println(":(");
        }
    }
}

Note that the Java code uses the `Scanner` class to read input from the user, and the `nextInt()` method to read an integer value from the input. The `if` statement is used to check if the value of `a` is less than 9 and the value of `b` is less than 9, and if both conditions are true, the program prints "Yay!". Otherwise, it prints ":(".</s>
