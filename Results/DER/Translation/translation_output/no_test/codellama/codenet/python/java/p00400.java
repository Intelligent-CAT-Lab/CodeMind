<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

n=int(input())
if(n>=65 and n<=90):
    print("1")
elif(n>=97 and n<=122):
    print("2")
else:
    print("0")


Translate the above python code to java.

java code:

[/INST]

Here is the Java code that translates the Python code:

```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n >= 65 && n <= 90) {
            System.out.println("1");
        } else if (n >= 97 && n <= 122) {
            System.out.println("2");
        } else {
            System.out.println("0");
        }
    }
}
```

Note that the `Scanner` class is used to read input from the user, and the `nextInt()` method is used to read an integer value from the user. The `if` statement is used to check if the input is between 65 and 90, and the `else if` statement is used to check if the input is between 97 and 122. If neither of these conditions are met, the `else` statement is executed and the output is "0".</s>
