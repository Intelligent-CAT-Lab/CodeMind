<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

n=int(input())
a=1
b=1
i=0
while i<n:
    a,b=b,a+b
    i+=1
print(a)


Translate the above python code to java.

java code:

[/INST]

Here is the Java code equivalent to the Python code:
```
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a = 1;
        int b = 1;
        int i = 0;
        while (i < n) {
            int temp = a;
            a = b;
            b = temp + b;
            i++;
        }
        System.out.println(a);
    }
}
```
Note that the `Scanner` class is used to read input from the user, and the `nextInt()` method is used to read an integer value from the user. The `System.out.println()` method is used to print the result to the console.</s>
