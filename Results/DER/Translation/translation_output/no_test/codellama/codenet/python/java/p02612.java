<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

n=int(input())
print(1000-n%1000 if n%1000!=0 else 0)

Translate the above python code to java.

java code:

[/INST]

Here is the Java code that translates the Python code:

```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int remainder = n % 1000;
        if (remainder != 0) {
            System.out.println(1000 - remainder);
        } else {
            System.out.println(0);
        }
    }
}
```

In this code, we first import the `Scanner` class from the `java.util` package, which allows us to read input from the user. We then create a new `Scanner` object and use it to read an integer from the user.

Next, we calculate the remainder of the input number divided by 1000 using the `%` operator. If the remainder is not equal to 0, we print the difference between 1000 and the remainder. Otherwise, we print 0.

Note that in Java, we use the `System.out.println()` method to print output to the console. This method is similar to the `print()` function in Python, but it also adds a newline character to the end of the output.</s>
