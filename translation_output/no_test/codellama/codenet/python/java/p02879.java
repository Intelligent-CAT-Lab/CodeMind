<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

a,b=input().split()
a=int(a)
b=int(b)

if 0<a and a<10 and 0<b and b<10:
    print(a*b)
else:
    print("-1")


Translate the above python code to java.

java code:

[/INST]

Here is the Java code that translates the Python code:

import java.util.Scanner;

public class Multiply {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] numbers = input.split(" ");
        int a = Integer.parseInt(numbers[0]);
        int b = Integer.parseInt(numbers[1]);

        if (a > 0 && a < 10 && b > 0 && b < 10) {
            System.out.println(a * b);
        } else {
            System.out.println("-1");
        }
    }
}</s>
