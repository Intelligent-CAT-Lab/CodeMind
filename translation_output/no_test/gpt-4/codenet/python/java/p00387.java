Below is the translation of the provided Python code to Java:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] tokens = scanner.nextLine().split(" ");
        int A = Integer.parseInt(tokens[0]);
        int B = Integer.parseInt(tokens[1]);
        int kimawasi = B / A;
        if (B % A > 0) {
            kimawasi = kimawasi + 1;
        }
        System.out.println(kimawasi);
        scanner.close();
    }
}
```
The Java code includes the necessary imports, parses the integers after reading them as strings, calculates `kimawasi` similarly as in the Python code, and prints out the result.
