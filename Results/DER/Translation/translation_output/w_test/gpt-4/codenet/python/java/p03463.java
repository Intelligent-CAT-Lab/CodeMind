Below is the translated Java code for the given Python snippet:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(); // Assuming 'a' is being read but not used, as per Python code.
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (Math.abs(b - c) % 2 == 0) {
            System.out.println("Alice");
        } else {
            System.out.println("Borys");
        }
        sc.close();
    }
}
```

To compile and run this Java program, you would typically save it to a file named `Main.java`, compile it with `javac Main.java`, and run it with `java Main`. Then you would input `5 2 4` to receive the expected output of "Alice". Note that the Java code includes the necessary import for `Scanner` and wraps the functionality in a `main` method within the `Main` class, following the standard structure for Java programs.
