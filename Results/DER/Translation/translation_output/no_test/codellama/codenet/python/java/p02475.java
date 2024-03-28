<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

a,b = map(int,input().split())

def round(a, b):
	if a * b < 0:
		return -(-a//b)
	else:
		return a//b

print(round(a, b))


Translate the above python code to java.

java code:

[/INST]

Here is the Java code equivalent to the Python code:
```
import java.util.Scanner;

public class Round {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(round(a, b));
    }

    public static int round(int a, int b) {
        if (a * b < 0) {
            return -(-a / b);
        } else {
            return a / b;
        }
    }
}
```
Note that the `round` function in Java is not the same as the `round` function in Python. In Java, the `round` function rounds a floating-point number to the nearest integer, while in Python, it rounds a number to the nearest integer or to the nearest multiple of a specified value.

Also, note that the `//` operator in Python is equivalent to the `/` operator in Java, but it returns the integer part of the result instead of the floating-point part.</s>
