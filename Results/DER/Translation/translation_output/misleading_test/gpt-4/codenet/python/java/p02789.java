Here is the translated code in Java:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        
        if (a == b) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        scanner.close();
    }
}
```
To run this code in your local environment, make sure to read the provided test input "3 3" without quotes when prompted. The expected output would be "Yes" if both numbers are the same, or "No" otherwise.
