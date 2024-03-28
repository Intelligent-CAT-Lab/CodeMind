<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python Code:

X = int ( input ( ) )
i = 1
a = 0
while True :
    a = a + X
    if a % 360 == 0 :
        print ( i )
        break
    i += 1



Translate the above python code to java.

java Code:

[/INST]

Here is the Java code equivalent to the Python code:
```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int X = scanner.nextInt();
        int i = 1;
        int a = 0;
        while (true) {
            a += X;
            if (a % 360 == 0) {
                System.out.println(i);
                break;
            }
            i++;
        }
    }
}
```
Note that the `Scanner` class is used to read input from the user, and the `nextInt()` method is used to read an integer value from the user. The `println()` method is used to print the output to the console.</s>
