<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

A,B=map(int,input().split())
x=(A**2-B**2)/(2*(A-B))
if x%1==0:
    print(int(x))
else:
    print('IMPOSSIBLE')

Translate the above python code to java.

java code:

[/INST]

Here is the Java code equivalent to the Python code:
```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        double x = (A * A - B * B) / (2 * (A - B));
        if (x % 1 == 0) {
            System.out.println((int) x);
        } else {
            System.out.println("IMPOSSIBLE");
        }
    }
}
```
Note that in Java, we use the `Scanner` class to read input from the user, and we use the `nextInt()` method to read an integer value. We also use the `double` data type to store the result of the calculation, since it can store decimal values. Finally, we use the `println()` method to print the result to the console.</s>
