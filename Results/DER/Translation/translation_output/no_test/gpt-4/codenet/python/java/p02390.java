Here is the equivalent Java code for the Python code you have provided:

```java
import java.util.Scanner;

public class TimeConversion {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of seconds: ");
        int ss = scanner.nextInt();
        
        int hour = ss / (60 * 60);
        int second = ss % (60 * 60);
        int minute = second / 60;
        second = second % 60;
        
        System.out.printf("%d:%d:%d\n", hour, minute, second);
        
        scanner.close();
    }
}
```

This Java program will take an input of seconds from the user, convert it to hours, minutes, and seconds, and then print out the result in the specified format (HH:MM:SS). Just like in the Python code, the `Scanner` is used for user input, and `System.out.printf` is used for formatted printing, which is similar to the `format` method in Python.
