Here is the equivalent Java code for the provided Python script:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if (a < 9 && b < 9) {
            System.out.println("Yay!");
        } else {
            System.out.println(":(");
        }

        scanner.close();
    }
}
```

This Java code includes importing the Scanner class for input, reading integer values from the user, and performing the conditional logic similar to the Python script. Don't forget to close the `Scanner` instance after its use to avoid resource leaks.
