Here is the Java equivalent of the Python code you provided:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] numbers = input.split(" ");
        int a = Integer.parseInt(numbers[0]);
        int b = Integer.parseInt(numbers[1]);
        int c = Integer.parseInt(numbers[2]);
        
        if (a + b + c < 22) {
            System.out.println("win");
        } else {
            System.out.println("bust");
        }
    }
}
```

This Java code does the same thing as your Python code. It reads a line of input from the user, splits it into three parts (assuming they are separated by spaces), converts each part to an integer, and then checks if the sum of the three integers is less than 22. If it is, it prints "win"; otherwise, it prints "bust".
