<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

N = int(input())
q, mod = divmod(N, 100)
print(1 if mod <= q * 5 else 0)

Translate the above python code to java.

java code:

[/INST]

Here is the Java code that translates the Python code:
```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int q = N / 100;
        int mod = N % 100;
        if (mod <= q * 5) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}
```
This code uses the `Scanner` class to read input from the user, and the `divmod` method to calculate the quotient and remainder of the division of `N` by 100. The `if` statement checks if the remainder is less than or equal to the quotient multiplied by 5, and if it is, it prints 1, otherwise it prints 0.</s>
