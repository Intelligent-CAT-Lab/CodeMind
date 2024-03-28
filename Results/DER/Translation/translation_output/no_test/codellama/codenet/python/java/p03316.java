<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

n = input()

sn = 0

for i in range(len(n)):
    sn += int(n[i])


if (int(n) % sn == 0):
    print("Yes")
else:
    print("No")


Translate the above python code to java.

java code:

[/INST]

Here is the Java code equivalent to the Python code:
```java
import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        int sn = 0;
        for (int i = 0; i < n.length(); i++) {
            sn += Character.getNumericValue(n.charAt(i));
        }
        if (n % sn == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
```
Note that in Java, we use the `Scanner` class to read input from the user, and the `Character.getNumericValue()` method to get the numeric value of a character. We also use the `length()` method to get the length of a string, and the `charAt()` method to get the character at a specific index in a string.</s>
