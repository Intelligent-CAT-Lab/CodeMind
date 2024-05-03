Here is the Java equivalent of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        int result = input * 2;
        int minutes = result % 60;
        int hours = result / 60;
        System.out.println(hours + " " + minutes);
    }
}
```

This Java code does the same thing as your Python code. It reads an integer from the user, multiplies it by 2, and then finds the remainder when divided by 60 to get the minutes. It then divides the result by 60 to get the hours. Finally, it prints out the hours and minutes.
