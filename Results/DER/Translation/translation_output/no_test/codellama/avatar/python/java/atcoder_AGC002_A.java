<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python Code:

a , b = map ( int , input ( ) . split ( ) )
if a <= 0 and 0 <= b :
    print ( " Zero " )
elif a < 0 and min ( b - a , - a ) % 2 == 0 :
    print ( " Negative " )
else :
    print ( " Positive " )



Translate the above python code to java.

java Code:

[/INST]

Here is the Java code that translates the Python code:

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        if (a <= 0 && 0 <= b) {
            System.out.println("Zero");
        } else if (a < 0 && Math.min(b - a, -a) % 2 == 0) {
            System.out.println("Negative");
        } else {
            System.out.println("Positive");
        }
    }
}

Note that the Java code uses the `Scanner` class to read input from the user, and the `Math.min` method to find the minimum of two numbers. The `Math.min` method is used instead of the Python `min` function because Java does not have a built-in `min` function.</s>
