<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

r, g, b = map(int, input().split())

if (g * 10 + b) % 4 == 0:
    print("YES")
else:
    print("NO")


Translate the above python code to java.

java code:

[/INST]

Here is the Java code equivalent to the Python code:
```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int r = scanner.nextInt();
        int g = scanner.nextInt();
        int b = scanner.nextInt();

        if ((g * 10 + b) % 4 == 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
```
Note that the `map` function in Python is not necessary in Java, as the `Scanner` class provides a method to read integers directly. Also, the `print` function in Python is replaced by `System.out.println` in Java.</s>
