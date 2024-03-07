<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

a,b=(int(x) for x in input().split())

if a<=100 and b<=100:
    print(f"{a*b/3.305785:.4f}")


Translate the above python code to java.

java code:

[/INST]

Here is the Java code equivalent to the Python code:
```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int a = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[1]);
        if (a <= 100 && b <= 100) {
            System.out.println(String.format("%.4f", a * b / 3.305785));
        }
    }
}
```
Note that the `Scanner` class is used to read input from the user, and the `String.format()` method is used to format the output to 4 decimal places.</s>
