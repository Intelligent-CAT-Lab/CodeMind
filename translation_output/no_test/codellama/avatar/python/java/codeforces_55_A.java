<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python Code:

n = int ( input ( ) )
while n % 2 == 0 :
    n /= 2
if n == 1 :
    print ( ' YES ' )
else :
    print ( ' NO ' )



Translate the above python code to java.

java Code:

[/INST]

Here is the Java code that translates the Python code:

```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        while (n % 2 == 0) {
            n /= 2;
        }
        if (n == 1) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
```

Note that the `Scanner` class is used to read input from the user, and the `nextInt()` method is used to read an integer value from the user. The `while` loop is used to repeatedly divide `n` by 2 until it is odd, and the `if` statement is used to check if `n` is equal to 1. If it is, the program prints "YES", otherwise it prints "NO".</s>
