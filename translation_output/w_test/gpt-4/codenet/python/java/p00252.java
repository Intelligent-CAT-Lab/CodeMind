Here's the equivalent Java code for the Python code you provided:

```java
import java.util.Scanner;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String B = scanner.nextLine();
        List<String> O = Arrays.asList("1 1 0", "0 0 1");

        if (O.contains(B)) {
            System.out.println("Open");
        } else {
            System.out.println("Close");
        }

        scanner.close();
    }
}
```

To run this code, simply compile it with `javac Main.java` and execute it with `java Main`. Then, you can input "0 0 1" followed by pressing Enter, and the program will output "Open", matching your expected output.
