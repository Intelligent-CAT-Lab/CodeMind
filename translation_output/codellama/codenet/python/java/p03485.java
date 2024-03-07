<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

a,b=map(int,input().split())
c = (a+b)/2
d = int(c)
if c-d>0:
  print(d+1)
else:
  print(d)

Translate the above python code to java.

java code:

[/INST]

Here is the Java code that translates the Python code:

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = (a + b) / 2;
        int d = (int) c;
        if (c - d > 0) {
            System.out.println(d + 1);
        } else {
            System.out.println(d);
        }
    }
}

Note that the Java code uses the `Scanner` class to read input from the user, and the `int` type to store integer values. The `if` statement is used to check if the result of the division is greater than 0, and the `println` method is used to print the result to the console.</s>
