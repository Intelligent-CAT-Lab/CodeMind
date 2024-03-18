Here's the translated Python code into Java:

```java
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        scanner.close();

        if (A >= 13) {
            System.out.println(B);
        } else if (A >= 6) {
            System.out.println(B / 2);
        } else {
            System.out.println(0);
        }
    }
}
```

To compile and run this Java program, you would save it in a file named `Main.java`, then use `javac` to compile it, and `java` to run it:

```
javac Main.java
java Main
```

After running the program, you would input `30 100` and press Enter to obtain the expected output, `35`.
