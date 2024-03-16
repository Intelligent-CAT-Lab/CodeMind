<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

a,b=map(int,input().split())
print((a+b)//2)


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
        System.out.println((a + b) / 2);
    }
}

In this code, we first import the `Scanner` class from the `java.util` package, which allows us to read input from the user. We then create a new `Scanner` object and use it to read two integers from the user, which we store in the variables `a` and `b`. Finally, we print the sum of `a` and `b` divided by 2.</s>
