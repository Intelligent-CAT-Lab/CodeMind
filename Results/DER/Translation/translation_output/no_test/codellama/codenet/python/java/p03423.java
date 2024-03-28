<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

print( int(input()) // 3)


Translate the above python code to java.

java code:

[/INST]

Here is the Java code that translates the Python code:
```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        int result = input / 3;
        System.out.println(result);
    }
}
```
This code uses the `Scanner` class to read an integer from the user, and then divides it by 3 using the `/` operator. The result is then printed to the console using `System.out.println()`.</s>
