Below is the translated code in Java. Since Java is statically typed and more verbose, more lines of code are required to replicate the Python code's behavior.

```java
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[3];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }

        Arrays.sort(numbers);

        if (numbers[0] == 5 && numbers[1] == 5 && numbers[2] == 7) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        scanner.close();
    }
}
```

For the given test input of "5 5 7" (to be entered manually when prompted), this Java code will print "YES" to the console, as expected. Remember to run this code within a Java development environment or compiler, and have the class properly named according to the file it's saved in (if saved as `Main.java`, the class should be `Main`, for instance).
