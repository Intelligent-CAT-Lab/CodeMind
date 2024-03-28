<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

a,b,c = map(int,input().split())
if a<b<c:
    print("Yes")
else:
    print("No")



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
        int c = scanner.nextInt();
        if (a < b && b < c) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}

Note that the Java code uses the `Scanner` class to read input from the user, and the `nextInt()` method to read an integer value. The `if` statement is used to check if the condition `a < b && b < c` is true, and if it is, the program prints "Yes" to the console. If the condition is false, the program prints "No" to the console.</s>
