Here is the Java equivalent of the Python code you provided:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        int result = input * 2;
        int minutes = result % 60;
        int hours = result / 60;
        System.out.println(hours + " " + minutes + " " + (58 - minutes));
    }
}
```

This Java program reads an integer from the user, multiplies it by 2, and then calculates the number of hours and minutes. The number of minutes is then subtracted from 58 to get the number of seconds. The program then prints out the hours, minutes, and seconds in the format specified in the problem.
