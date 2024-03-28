<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

a,b,c,d=map(int, input().split())
print("YNeos"[not (abs(a-c)<=d or abs(a-b)<=d and abs(b-c)<=d)::2])

Translate the above python code to java.

java code:

[/INST]
```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();

        if (Math.abs(a - c) <= d || (Math.abs(a - b) <= d && Math.abs(b - c) <= d)) {
            System.out.println("Y");
        } else {
            System.out.println("N");
        }
    }
}
```
This code uses the `Scanner` class to read input from the user, and the `Math.abs()` method to calculate the absolute value of the differences between the numbers. The `if` statement checks if the absolute value of the difference between `a` and `c` is less than or equal to `d`, or if the absolute value of the difference between `a` and `b` is less than or equal to `d` and the absolute value of the difference between `b` and `c` is less than or equal to `d`. If either of these conditions is true, the code prints "Y", otherwise it prints "N".</s>
