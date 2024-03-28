Below is the Python code translated to Java:

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

When you input "3 5" in this program, it will output "2" as expected.
