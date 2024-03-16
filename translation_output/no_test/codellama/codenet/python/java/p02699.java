<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

s, w = map(int, input().split())

if w >= s :
    print("unsafe")
else:
    print("safe")

Translate the above python code to java.

java code:

[/INST]

Here is the Java code that translates the Python code:

import java.util.Scanner;

public class SafeOrUnsafe {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int w = sc.nextInt();

        if (w >= s) {
            System.out.println("unsafe");
        } else {
            System.out.println("safe");
        }
    }
}

Note that the Java code uses the `Scanner` class to read input from the user, and the `nextInt()` method to read the input as an integer. The `if` statement is used to check if the weight is greater than or equal to the speed, and the `println()` method is used to print the result.</s>
