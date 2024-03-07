<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

a, b = map(int, raw_input().split())
 
print "%d %d %f" % (a / b, a % b, float(a)/ b)

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
        System.out.println(a / b + " " + a % b + " " + (float) a / b);
    }
}

The Java code uses the `Scanner` class to read input from the user, and the `nextInt()` method to read the two integers. The `println()` method is used to print the output. The `(float) a / b` expression is used to convert the result of the division to a floating-point number.</s>
