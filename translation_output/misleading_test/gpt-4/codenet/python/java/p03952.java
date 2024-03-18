Here's the equivalent Java code for the provided Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int x = Integer.parseInt(input[1]);

        if (x == 1 || x == 2 * N - 1) {
            if (N != 1) {
                System.out.println("No");
                return;
            } else {
                System.out.println("Yes");
                System.out.println(1);
                return;
            }
        }

        boolean smaller = true;
        if (x > N) {
            smaller = false;
            x = 2 * N - x;
        }

        int[] ans = new int[2 * N - 1];
        int index = 0;
        for (int i = 2 * N - 1; i >= N + x; --i) {
            ans[index++] = i;
        }
        for (int i = 1; i < N + x; ++i) {
            ans[index++] = i;
        }
        if (!smaller) {
            for (int i = 0; i < ans.length; ++i) {
                ans[i] = 2 * N - ans[i];
            }
        }

        System.out.println("Yes");
        for (int i = 0; i < ans.length; ++i) {
            System.out.println(ans[i]);
        }

        scanner.close();
    }
}
```

This code translates the functionality provided in the Python script into Java, maintaining the same logic and structure. `,` Make sure you have a class named `Main` or rename it to the class name you are using.

To compile and run this Java program, you would save it to a file named `Main.java`, then use `javac Main.java` to compile and `java Main` to run it, providing input in the form described in the test case. Remember that you need to enter the input manually when running the Java application from the command line.
