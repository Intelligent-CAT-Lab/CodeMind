Here is the equivalent Java code for the provided Python snippet.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Reading space-separated integers from the user input
        int X = scanner.nextInt();
        int Y = scanner.nextInt();
        int Z = scanner.nextInt();

        // Initial assignments
        int A = X;
        int B = Y;
        int C = Z;

        // Swapping the variable values
        B = X;
        C = Y;
        A = Z;

        // Printing out the results
        System.out.println(A + " " + B + " " + C);

        scanner.close();
    }
}
```

Keep in mind that in Java, you need to use the `Scanner` class to read user input, you have to declare the data type of variables, and also need to have a `main` method within a `public` class to run the code. Unlike Python, Java is strongly typed, so you need to specify that `X`, `Y`, `Z`, `A`, `B`, and `C` are integers (`int`). Additionally, in Java, you need to close the `Scanner` after you're done using it to prevent resource leaks.
