<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

from math import pi

A, B = map(float, input().split())
print('{:.10f}'.format(4/3*pi*B**3))


Translate the above python code to java.

java code:

[/INST]

Here is the Java code that translates the Python code:

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double A = scanner.nextDouble();
        double B = scanner.nextDouble();
        System.out.println(String.format("%.10f", 4/3*Math.PI*B*B*B));
    }
}

Note that the Java code uses the `Scanner` class to read input from the user, and the `Math.PI` constant to represent the value of pi. The `String.format()` method is used to format the output to 10 decimal places.</s>
