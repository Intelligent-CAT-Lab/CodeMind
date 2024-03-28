<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

n=int(input())%10
if n==3:
    print("bon")
elif n in [2,4,5,7,9]:
    print("hon")
else:
    print("pon")


Translate the above python code to java.

java code:

[/INST]

Here is the Java code that translates the Python code:
```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt() % 10;
        if (n == 3) {
            System.out.println("bon");
        } else if (n == 2 || n == 4 || n == 5 || n == 7 || n == 9) {
            System.out.println("hon");
        } else {
            System.out.println("pon");
        }
    }
}
```
Note that the `Scanner` class is used to read input from the user, and the `%` operator is used to get the remainder of the division of the input number by 10.</s>
