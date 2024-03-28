<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python Code:

a , b = input ( ) . split ( )
b = b [ 0 ] + b [ 2 : ]
a = int ( a )
b = int ( b )
print ( a * b // 100 )



Translate the above python code to java.

java Code:

[/INST]

Here is the Java code that translates the Python code:

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] numbers = input.split(" ");
        int a = Integer.parseInt(numbers[0]);
        int b = Integer.parseInt(numbers[1]);
        b = b / 100;
        System.out.println(a * b);
    }
}

Note that the Java code uses the `Scanner` class to read input from the user, and the `split` method to split the input string into two parts. The `parseInt` method is used to convert the input strings to integers. The `//` operator is used to perform integer division, which is equivalent to rounding down to the nearest integer.</s>
