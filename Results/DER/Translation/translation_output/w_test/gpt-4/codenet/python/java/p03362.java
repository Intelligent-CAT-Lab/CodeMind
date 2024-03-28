Here is the Python code above translated into Java:

```java
import java.util.*;
import java.io.*;

public class Main {

    private static final int INF = (int)1e16;
    private static final int MOD = (int)1e9 + 7;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        List<Integer> primeNumbers = makePrimeNumbers(2000);
        ArrayList<Integer> ans = new ArrayList<>();

        for (Integer pi : primeNumbers) {
            if (pi % 10 == 1) {
                ans.add(pi);
            }
            if (ans.size() == n) {
                break;
            }
        }

        for (int i = 0; i < ans.size(); i++) {
            System.out.print(ans.get(i));
            if (i < ans.size() - 1) {
                System.out.print(" ");
            }
        }
    }

    private static List<Integer> makePrimeNumbers(int n) {
        List<Integer> primeNumbers = new ArrayList<>();
        if (n >= 2) {
            primeNumbers.add(2);
        }
        outer:
        for (int i = 3; i <= n; i++) {
            int sqrtI = (int) Math.sqrt(i) + 1;
            for (int p : primeNumbers) {
                if (p >= sqrtI) {
                    primeNumbers.add(i);
                    continue outer;
                }
                if (i % p == 0) {
                    continue outer;
                }
            }
        }
        return primeNumbers;
    }
}
```

Make sure to include proper input and output handling if you're going to use this code in production, such as catching `InputMismatchException` or `NoSuchElementException` when using a `Scanner` for inputs. In the code snippet above, I'm assuming that the input received is well-formatted and doesn't need additional error checking.

The `Main` class could be compiled and run with the expected input, and it should provide the expected output.
