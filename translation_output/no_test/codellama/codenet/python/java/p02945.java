<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

a, b=map(int, input().split())
print(max(a-b, a+b, a*b))


Translate the above python code to java.

java code:

[/INST]

Here is the Java code that translates the Python code:

import java.util.Scanner;

public class Max {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int max = Math.max(a - b, Math.max(a + b, a * b));
        System.out.println(max);
    }
}

The Java code uses the `Scanner` class to read input from the user, and the `Math.max()` method to find the maximum of the three numbers.</s>
