<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

# ABC067 A - Sharing Cookies
a,b = map(int,input().split())

if a%3 == 0:
    print('Possible')
elif b%3 == 0:
    print('Possible')
elif (a+b)%3 == 0:
    print('Possible')
else:
    print('Impossible')

Translate the above python code to java.

java code:

[/INST]

Here is the Java code that translates the Python code:
```
import java.util.Scanner;

public class SharingCookies {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if (a % 3 == 0) {
            System.out.println("Possible");
        } else if (b % 3 == 0) {
            System.out.println("Possible");
        } else if ((a + b) % 3 == 0) {
            System.out.println("Possible");
        } else {
            System.out.println("Impossible");
        }
    }
}
```
This code uses the `Scanner` class to read the input from the user, and then uses the `%` operator to check if the input is divisible by 3. If any of the conditions are true, the code prints "Possible", otherwise it prints "Impossible".</s>
