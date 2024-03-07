<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

a,b=map(int,input().split())
if a<=b:
    print(str(a)*b)
else:
    print(str(b)*a)

Translate the above python code to java.

java code:

[/INST]

Here is the Java code that translates the Python code:
```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        if (a <= b) {
            System.out.println(String.valueOf(a).repeat(b));
        } else {
            System.out.println(String.valueOf(b).repeat(a));
        }
    }
}
```
Note that the `repeat` method is used to repeat the string `a` or `b` based on the condition.</s>
