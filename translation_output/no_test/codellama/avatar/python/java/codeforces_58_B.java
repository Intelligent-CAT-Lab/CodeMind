<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python Code:

a = int ( input ( ) )
for i in range ( a , 0 , - 1 ) :
    if a % i == 0 :
        print ( i , end = ' â ' )
        a = i



Translate the above python code to java.

java Code:

[/INST]

Here is the Java code equivalent to the Python code:
```
import java.util.Scanner;

public class PrimeFactors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = scanner.nextInt();
        for (int i = a; i > 0; i--) {
            if (a % i == 0) {
                System.out.print(i + " ");
                a = i;
            }
        }
    }
}
```
This code uses the `Scanner` class to read input from the user, and the `nextInt()` method to read an integer value. The `for` loop iterates from `a` to 0, and the `if` statement checks if `a` is divisible by `i`. If it is, the `print()` method is used to print the value of `i`, and the `a` variable is set to `i`.

Note that the `end` parameter in the Python code is not necessary in Java, as the `print()` method in Java automatically adds a newline character at the end of the output.</s>
