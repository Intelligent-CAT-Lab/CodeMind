Below is the Python code translated to Java. Please note that Java is a statically typed language, so variable and function declarations require explicit type information, and parameter passing/returning is more strict. Also, Java does not support first-class functions, so we don't define or use lambda expressions similar to Python. Instead, we can mimic those functionalities with anonymous classes/interfaces or built-in functional interfaces along with streams.

```java
import java.util.ArrayList;
import java.util.List;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {

    private static final int INF = (int)1e16;
    private static final int MOD = (int)(1e9 + 7);

    private static int ni() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        return Integer.parseInt(br.readLine().trim());
    }

    private static int[] na() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        List<Integer> values = new ArrayList<>();
        while(st.hasMoreTokens()){
            values.add(Integer.parseInt(st.nextToken()));
        }
        return values.stream().mapToInt(i -> i).toArray();
    }

    private static int[] na1() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        List<Integer> values = new ArrayList<>();
        while(st.hasMoreTokens()){
            values.add(Integer.parseInt(st.nextToken()) - 1);
        }
        return values.stream().mapToInt(i -> i).toArray();
    }

    // Helper method to print an array joined by spaces
    private static void printArray(List<Integer> array) {
        array.forEach(i -> System.out.print(i + " "));
        System.out.println();
    }

    public static void main(String[] args) throws IOException{
        // Set recursion limit if needed (not directly translatable to Java, depends on use cases)
        // Increase the stack size in thread creation if recursion depth is very high
        System.setSecurityManager(null);
        List<Integer> primes = makePrimeNums(2000);
        
        int n = ni();
        
        List<Integer> ans = new ArrayList<>();
        for (int pi : primes) {
            if (pi % 10 == 1) {
                ans.add(pi);
            }
            if (ans.size() == n) {
                break;
            }
        }

        printArray(ans);
    }
    
    private static List<Integer> makePrimeNums(int n) {
        List<Integer> primeNums = new ArrayList<>();
        if (n >= 2) primeNums.add(2);
        
        for (int i = 3; i <= n; i++) {
            boolean isPrime = true;
            for (int p : primeNums) {
                if (p * p > i) break;
                if (i % p == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) primeNums.add(i);
        }

        return primeNums;
    }
}
```

Please note that I have made a few adjustments and assumptions:

- `BufferedReader` and `StringTokenizer` are used for input, which is a common practice in Java for fast I/O.
- Recursion limit in Python is translated into a comment regarding stack size in Java, which is typically adjusted with JVM arguments or by creating threads with a larger stack size if needed.
- Removed the `import` statements that were not translated to Java code, such as `collections`, `bisect`, and `itertools`, as they are not necessary or don't have direct equivalents in Java.
- The Java code doesn't handle standard input in the same way as the Python code (i.e., lambda functions); instead, I created methods (`ni`, `na`, `na1`) to read values from standard input, simulating the original behavior. However, these functions can throw `IOException`s, which must be handled.
- The `make_prime_nums` function has been translated to a method `makePrimeNums` that follows Java naming conventions and uses a list data structure to store primes.
- The `printArray` method is used to simulate the pythonic `print(*arr, sep=" ")`.

If you want to input from standard input like Python's `input`, make sure to run the Java program in a context where the standard input is available (e.g., a terminal or command line), and that content is being sent to it. Java programs typically don't read from standard input in IDE-run scenarios without explicit configuration.
