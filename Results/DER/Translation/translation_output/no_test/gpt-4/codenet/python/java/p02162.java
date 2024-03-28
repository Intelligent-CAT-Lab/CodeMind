Here is the Python code translated to Java:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t1 = scanner.nextInt();
        int t2 = scanner.nextInt();
        int r1 = scanner.nextInt();
        int r2 = scanner.nextInt();

        if (r1 == -1 || r2 == -1) {
            if (t1 < t2) {
                System.out.println("Alice");
            } else if (t1 > t2) {
                System.out.println("Bob");
            } else {
                System.out.println("Draw");
            }
        } else if (r1 > r2) {
            System.out.println("Alice");
        } else if (r1 < r2) {
            System.out.println("Bob");
        } else {
            System.out.println("Draw");
        }

        scanner.close();
    }
}
```

To run this Java code, you need to compile it first using the `javac` command and then run the compiled class with `java`. Make sure to include this class in a file named `Main.java` (as the class is public and named Main) to comply with Java conventions.
