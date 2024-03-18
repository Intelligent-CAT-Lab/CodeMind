Here is the Python code translated into Java. I have encapsulated each function into a Java class with static methods and included the necessary imports:
Please note that the original code contains some functions that are not used, and the comments are in Japanese which appears to be discussing an algorithm, but the main focus of the translation is on the `D` function that calculates the Sunuke numbers.

```java
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
    
    public static class SunukeSolver {
        public static void solve(int k) {
            long ans = 1;
            int i = 0;
            while (k > 0) {
                System.out.println(ans);
                k--;
                if (check(ans, i)) {
                    i++;
                }
                ans += Math.pow(10, i);
            }
        }

        private static double sunuke(long a) {
            return a / (double)IntStream.of(String.valueOf(a).split(""))
                                         .mapToInt(Integer::parseInt)
                                         .sum();
        }

        private static boolean check(long a, int i) {
            return sunuke(a + (long)Math.pow(10, i)) > sunuke(a + (long)Math.pow(10, i + 1));
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        SunukeSolver.solve(k);
        scanner.close();
    }
}
```

To run this code, use the `main` method as the entry point. It will read an integer `k` from standard input and print out the sequence of Sunuke numbers, which are determined by the ratio of the number to the sum of its digits, ensuring that each subsequent number after an increment is optimized by the given algorithm.
