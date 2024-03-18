Here is the equivalent Java code for the Python code you provided:

```java
import java.util.Scanner;

public class TemperatureCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int X = scanner.nextInt();
        
        if (X >= 30) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        
        scanner.close();
    }
}
```

To execute this code for your test input, you will need to compile and run the `TemperatureCheck` class and then input the value `25` when prompted. The program will print `No` as expected, according to the logic provided in the Python code.
