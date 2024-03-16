<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

L, R = map(int,(input().split()))
print(L*R)

Translate the above python code to java.

java code:

[/INST]

Here is the Java code that translates the Python code:
```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int L = scanner.nextInt();
        int R = scanner.nextInt();
        System.out.println(L * R);
    }
}
```
This code uses the `Scanner` class to read input from the user, and then uses the `nextInt()` method to read the two integers `L` and `R`. Finally, it prints the product of `L` and `R` using the `println()` method.</s>
