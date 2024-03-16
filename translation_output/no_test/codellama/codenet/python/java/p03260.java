<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

a, b = map(int, input().split())
print("Yes" if a % 2 != 0 and b % 2 != 0 else "No")


Translate the above python code to java.

java code:

[/INST]

Here is the Java code that translates the Python code:

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        if (a % 2 != 0 && b % 2 != 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}

This code uses the `Scanner` class to read input from the user, and the `nextInt()` method to read the input as an integer. The `if` statement checks if the input is divisible by 2, and if it is not, it prints "Yes" to the console. If the input is divisible by 2, it prints "No" to the console.</s>
