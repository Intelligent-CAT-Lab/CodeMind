Here's the translated Java code for the provided Python code snippet:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.nextLine();
        int ans = 0;
        for (int i = 0; i < S.length() - 1; i++) {
            if (S.charAt(i) != S.charAt(i + 1)) {
                ans += 1;
            }
        }
        System.out.println(ans);
        scanner.close();
    }
}
```

To compile and run this Java program, make sure you have Java installed on your system. Save the code in a file named `Main.java`, then compile it with the following command:

```bash
javac Main.java
```

To run the compiled program, use the following command:

```bash
java Main
```

For the given test input "BBBWW", the expected output will be `1`. When running the program, input "BBBWW" (without quotes) and press Enter to see the expected output.
