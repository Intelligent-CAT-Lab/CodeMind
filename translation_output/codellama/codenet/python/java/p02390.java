<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

ss = int(input())
hour = ss // 60**2
second = ss % 60**2
minute = second // 60
second = second % 60
print('{}:{}:{}'.format(hour, minute, second))


Translate the above python code to java.

java code:

[/INST]

Here is the Java code equivalent to the Python code:
```
import java.util.Scanner;

public class TimeConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of seconds: ");
        int ss = scanner.nextInt();
        int hour = ss / 60 / 60;
        int minute = (ss % 60) / 60;
        int second = ss % 60;
        System.out.println(String.format("%d:%d:%d", hour, minute, second));
    }
}
```
Note that the `Scanner` class is used to read input from the user, and the `String.format()` method is used to format the output as a string.</s>
