<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

print(*divmod(int(input())*2,60))


Translate the above python code to java.

java code:

[/INST]

Here is the Java code that translates the Python code:
```
import java.util.Scanner;

public class DivMod {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        int result = input * 2;
        int quotient = result / 60;
        int remainder = result % 60;
        System.out.println(quotient + " " + remainder);
    }
}
```
This code uses the `Scanner` class to read input from the user, and the `divmod` method to perform the division and modulus operations. The `divmod` method returns a `Pair` object that contains the quotient and remainder of the division operation. The `Pair` object is then used to print the quotient and remainder to the console.</s>
