Here's the Java translation of the given Python code, including a `Scanner` to take inputs and the conditional logic to produce the output:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if (b - a == c - b) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        scanner.close();
    }
}
```

To run the above Java program, you would compile it using a Java compiler and then execute the compiled class. Here's how you could test the given sample test case:

```bash
$ javac Main.java
$ echo "2 4 6" | java Main
YES
```

The first command will compile the `Main.java` file, and the second command will run the program, providing the "2 4 6" test case as the input, and you should see "YES" as the output.
