Here's the equivalent Java code for the given Python script:

```java
import java.util.Scanner;

public class TetrominoScore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int I = scanner.nextInt();
        int O = scanner.nextInt();
        int T = scanner.nextInt(); // not used in the code logic
        int J = scanner.nextInt();
        int L = scanner.nextInt();
        int S = scanner.nextInt(); // not used in the code logic
        int Z = scanner.nextInt(); // not used in the code logic

        int a = 0;
        if (I > 0 && J > 0 && L > 0) {
            a = ((I - 1) / 2 + (J - 1) / 2 + (L - 1) / 2) * 2 + 3 + O;
        }
        int b = (I / 2 + J / 2 + L / 2) * 2 + O;
        int ans = Math.max(a, b);

        System.out.println(ans);

        scanner.close();
    }
}
```

Please note:
- Java doesn't support unpacking like in Python, so you need to declare and initialize each variable separately.
- In Java, integer division already behaves like the Python floor division (//), so there is no need to worry about converting the division results to lower integers; `//` has been replaced with `/`.
- System.in is used with Scanner to get user input in Java.
- Math.max is used to find the maximum value between two integers.
- `print` is replaced with `System.out.println` to output the result in Java.
- I included T, S, and Z in the scanner input to keep the input structure the same, even though they are not used in the rest of the code.
