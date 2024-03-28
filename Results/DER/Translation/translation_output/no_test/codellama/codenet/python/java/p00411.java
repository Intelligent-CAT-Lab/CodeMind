<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

a, t, r = list(map(int, input().split()))
ans = r * t / a
print("{:.6f}".format(ans))


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
        int t = scanner.nextInt();
        int r = scanner.nextInt();
        double ans = r * t / a;
        System.out.println(String.format("%.6f", ans));
    }
}
```
This code uses the `Scanner` class to read input from the user, and the `String.format()` method to format the output to six decimal places.</s>
