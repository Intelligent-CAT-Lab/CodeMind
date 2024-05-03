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
        System.out.println(hours + " " + minutes);
    }
}
```

This Java program reads an integer from the user, multiplies it by 2, and then calculates the number of hours and minutes. It then prints out the hours and minutes in the format "hours minutes".
