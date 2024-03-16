<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

num = int(input())

print(num * 32)


Translate the above python code to java.

java code:

[/INST]

Here is the Java code that translates the Python code:

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        System.out.println(num * 32);
    }
}

In this code, we first import the `Scanner` class from the `java.util` package, which allows us to read input from the user. We then create a new `Scanner` object and use its `nextInt()` method to read an integer from the user. Finally, we print the result of multiplying the input number by 32.</s>
