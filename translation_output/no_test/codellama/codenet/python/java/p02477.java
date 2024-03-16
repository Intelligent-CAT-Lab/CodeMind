<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

a,b = map(int,input().split())
print(a*b)


Translate the above python code to java.

java code:

[/INST]

Here is the Java code that translates the Python code:

import java.util.Scanner;

public class Multiply {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(a * b);
    }
}

This code uses the `Scanner` class to read input from the user, and then uses the `nextInt()` method to read the two integers and store them in the variables `a` and `b`. Finally, it uses the `println()` method to print the result of multiplying `a` and `b`.</s>
