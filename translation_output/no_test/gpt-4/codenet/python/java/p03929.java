Here's the translated Java code from the given Python code. I encapsulated the whole Python script into a Java class called `Calculation` with a `main` method, which is the entry point for Java applications:

```java
import java.util.Scanner;

public class Calculation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        scanner.close(); // It's a good practice to close the scanner when it's no longer needed
    
        // Perform calculations similarly to the Python code
        int[] r = new int[11];
        for (int i = 1; i <= 11; i++) {
            int m = 0;
            for (int j = 1; j <= 5; j++) {
                int t = 0;
                for (int x = 0; x < 3; x++) {
                    for (int y = 0; y < 3; y++) {
                        t += 7 * (i + y) + (j + x) - 7;
                    }
                }
                if (t % 11 == k) m += 1;
            }
            r[i - 1] = m;
        }
        
        int a = n / 11;
        int b = n % 11;
        int ans = 0;
        ans += a * sum(r);
        if (b < 1) ans -= r[r.length - 2];
        if (b < 2) ans -= r[r.length - 1];
        if (b >= 3) {
            for (int i = 0; i < (b - 2); i++) ans += r[i];
        }
        
        System.out.println(ans);
    }
    
    // A helper method to calculate the sum of elements in an array
    private static int sum(int[] arr) {
        int total = 0;
        for (int value : arr) {
            total += value;
        }
        return total;
    }
}
```

This Java program performs the same operations as the Python script you provided. The input is taken from the user via the console, just like in the Python code, and the results are printed to the console. The helper method `sum` calculates the sum of all elements in an integer array. Please note that Java array indexing starts at 0, unlike Python which starts at 1, so adjustments have been made accordingly in the for loops.
