<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

n = int(input())
k = 1
for j in range(1,n+1):
    k *= j
print(k)


Translate the above python code to java.

java code:

[/INST]

Here is the Java code that translates the Python code:
```
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        int k = 1;
        for (int j = 1; j <= n; j++) {
            k *= j;
        }
        System.out.println("The factorial of " + n + " is " + k);
    }
}
```
This code uses the `Scanner` class to read input from the user, and the `for` loop to calculate the factorial of the input number. The `k` variable is initialized to 1 and then multiplied by each number from 1 to `n` using the `*` operator. Finally, the result is printed to the console.</s>
