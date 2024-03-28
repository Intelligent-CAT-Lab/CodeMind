<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

a,b = map(int,input().split())
print(a%b)


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
        System.out.println(a % b);
    }
}

This code uses the `Scanner` class to read input from the user, and then uses the `%` operator to calculate the remainder of `a` divided by `b`. Finally, it prints the result to the console.</s>
