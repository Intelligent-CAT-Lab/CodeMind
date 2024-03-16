Here's the Python code translated into Java:

```java
import java.util.Scanner;

public class Main {
    private static int[] n;
    private static int lb, ub;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Get the input as a string, convert it to a character array and then to int array
        char[] inputChars = scanner.nextLine().toCharArray();
        n = new int[inputChars.length];
        for (int i = 0; i < inputChars.length; i++) {
            n[i] = inputChars[inputChars.length - i - 1] - '0'; // reverse and convert to int
        }

        lb = 0;
        ub = n.length;

        // The main loop to do binary search
        while (ub - lb > 1) {
            int mid = (lb + ub) / 2;
            if (check(9 * mid)) {
                ub = mid;
            } else {
                lb = mid;
            }
        }

        System.out.println(ub);
        scanner.close();
    }

    private static boolean check(int x) {
        int g = 0;
        for (int i : n) {
            x -= (x + g - i) % 10;
            if (x < 0) {
                break;
            }
            g = (x + g) / 10;
        }
        return x >= 0;
    }
}
```

To run this program, you would use the `Main` class. Make sure to compile the code with your Java compiler, and run the program with the sample test input, which should give you the expected output.
