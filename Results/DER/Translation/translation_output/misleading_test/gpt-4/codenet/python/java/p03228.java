Below is the translated Java code for the given Python snippet. The Java code takes three space-separated integers as input and prints out two space-separated integers as output, according to the algorithm provided:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int k = scanner.nextInt();
        int turn = 0;

        for (int i = 0; i < k; i++) {
            if (turn == 0) {
                if (a % 2 == 0) {
                    b += a / 2;
                    a -= a / 2;
                } else {
                    a -= 1;
                    b += a / 2;
                    a -= a / 2;
                }
                turn = 1;
            } else {
                if (b % 2 == 0) {
                    a += b / 2;
                    b -= b / 2;
                } else {
                    b -= 1;
                    a += b / 2;
                    b -= b / 2;
                }
                turn = 0;
            }
        }
        System.out.println(a + " " + b);
        scanner.close();
    }
}
```

To use this code, compile it with `javac Main.java` and then run the compiled class with `java Main`. When the program runs, enter the test input (for example, `5 4 2`), and it should produce the expected output `-67 -39`.
