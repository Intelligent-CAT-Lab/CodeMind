Here's the Python code you've provided translated into Java:

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

To run this code, you would compile the `Main` class and then execute it, providing the input "5 4" when prompted. The expected output would be "Yay!" as per the test case provided.
