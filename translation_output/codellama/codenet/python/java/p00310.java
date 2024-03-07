<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

p, m, c = map(int, input().split())
print(p+m+c)


Translate the above python code to java.

java code:

[/INST]

Here is the Java code that translates the Python code:

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int p = scanner.nextInt();
        int m = scanner.nextInt();
        int c = scanner.nextInt();
        System.out.println(p + m + c);
    }
}

This code uses the `Scanner` class to read input from the user, and then uses the `nextInt()` method to read the input as an integer. The `System.out.println()` method is used to print the sum of the three numbers.</s>
