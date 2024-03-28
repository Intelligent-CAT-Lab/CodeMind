Here's the equivalent Java code for the given Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int r = scanner.nextInt();

        if (n < 10) {
            System.out.println(r + (100 * (10 - n)));
        } else {
            System.out.println(r);
        }

        scanner.close();
    }
}
```

To run this Java program, you will need to compile it first using `javac`, and then execute the generated class file using `java`. To do so, if the above code is saved in a file named `Main.java`, you can use the following commands:

```bash
javac Main.java
java Main
```

Then you would provide the test input (`2 2919`) when prompted, and you should see the expected output (`3719`).
