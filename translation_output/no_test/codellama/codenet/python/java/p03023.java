<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

n = int(input())
s = 180 * (n - 2)
print(s)

Translate the above python code to java.

java code:

[/INST]

Here is the Java code that translates the Python code:

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int s = 180 * (n - 2);
        System.out.println(s);
    }
}

In this code, we first import the `Scanner` class from the `java.util` package, which allows us to read input from the user. We then create a new `Scanner` object and use it to read an integer from the user. We store this integer in a variable called `n`.

Next, we calculate the value of `s` using the formula `180 * (n - 2)`. We then print the value of `s` to the console using the `System.out.println()` method.

Note that the `Scanner` class is used to read input from the user, and the `System.out.println()` method is used to print output to the console.</s>
