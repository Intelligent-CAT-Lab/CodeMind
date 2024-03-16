Here's the translated Java code along with the logic implemented. Since Java doesn't have a built-in method to take space-separated inputs on the same line directly into separate variables like Python does, we first need to read the entire line as a string, then split it using space as a delimiter, and finally parse each part into an integer.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Reading the entire line and splitting it into parts
        String[] parts = scanner.nextLine().split(" ");
        int a = Integer.parseInt(parts[0]);
        int b = Integer.parseInt(parts[1]);
        int c = Integer.parseInt(parts[2]);

        String ans = "No";
        if (a + b == c) {
            ans = "Yes";
        }
        if (a + c == b) {
            ans = "Yes";
        }
        if (b + c == a) {
            ans = "Yes";
        }

        System.out.println(ans);

        scanner.close();
    }
}
```

If you run this Java program with the input `10 30 20`, it will output `Yes` as expected.
