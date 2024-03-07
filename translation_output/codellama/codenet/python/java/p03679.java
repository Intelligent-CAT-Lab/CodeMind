<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

x,a,b=map(int,input().split())
if b<=a:
  print('delicious')
elif (b-a)<=x:
  print('safe')
else:
  print('dangerous')

Translate the above python code to java.

java code:

[/INST]

Here is the Java code equivalent to the Python code:
```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if (b <= a) {
            System.out.println("delicious");
        } else if ((b - a) <= x) {
            System.out.println("safe");
        } else {
            System.out.println("dangerous");
        }
    }
}
```
Note that the `Scanner` class is used to read input from the user, and the `nextInt()` method is used to read an integer value from the user. The `System.out.println()` method is used to print the output to the console.</s>
