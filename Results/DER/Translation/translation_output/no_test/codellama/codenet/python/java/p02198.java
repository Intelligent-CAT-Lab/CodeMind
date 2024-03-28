<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

N,M=map(int,input().split())
print(N*M)


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
        int M = scanner.nextInt();
        System.out.println(N * M);
    }
}
```
This code uses the `Scanner` class to read the input from the user, and then it prints the product of the two numbers.

Note that in Java, the `nextInt()` method of the `Scanner` class is used to read an integer value from the user. The `println()` method is used to print the result to the console.</s>
