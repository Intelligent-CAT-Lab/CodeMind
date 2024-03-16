Below is the translated Java code. I have used `Scanner` for input operations and provided necessary imports. Please note that in Java, functions and I/O handling are usually defined within a class:

```java
import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.AbstractMap.SimpleEntry;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Collections;
import java.util.function.Function;
import java.util.function.BiFunction;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.stream.IntStream;

public class Main {
    private static final long MOD = 1000000007;
    private static final double INF = Double.POSITIVE_INFINITY;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Setting recursion limit is not required in Java as it depends on the JVM stack size
        // and cannot be changed programmatically.

        int H = scanner.nextInt();
        int W = scanner.nextInt();
        System.out.println(H != 1 && W != 1 ? (int)Math.ceil(H * W / 2.0) : 1);
        
        scanner.close();
    }
    
    // Following utility methods are not directly required by the above Python code
    // but are provided here as they may help in writing equivalent functions in Java
    // based on the original Python code's context.
    
    public static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }

    public static int ceil(int x, int y) {
        return (x + y - 1) / y;
    }

    public static double hypot(double x, double y) {
        return Math.hypot(x, y);
    }

    public static long factorial(long n) {
        long result = 1;
        for (long i = 2; i <= n; i++) {
            result = (result * i) % MOD;
        }
        return result;
    }

    public static double radians(double angleInDegrees) {
        return Math.toRadians(angleInDegrees);
    }

    public static double sinOfAngle(double angle) {
        return Math.sin(angle);
    }

    public static double cosOfAngle(double angle) {
        return Math.cos(angle);
    }

    // Other constants such as PI are available in Java's Math.PI and similar for E
    // We can directly use `Math.PI` where `pi` is used in Python

    public static <K> Map<K, Long> counter(K[] array) {
        Map<K, Long> countMap = new HashMap<>();
        for (K key : array) {
            countMap.merge(key, 1L, Long::sum);
        }
        return countMap;
    }

    public static <T> List<List<T>> permutations(List<T> list, int r) {
        List<List<T>> allPermutations = new ArrayList<>();
        permutationsHelper(list, r, 0, new ArrayList<>(), allPermutations);
        return allPermutations;
    }

    private static <T> void permutationsHelper(List<T> list, int r, int start, List<T> current,
                                               List<List<T>> allPermutations) {
        if (current.size() == r) {
            allPermutations.add(new ArrayList<>(current));
            return;
        }
        for (int i = start; i < list.size(); i++) {
            Collections.swap(list, i, start);
            current.add(list.get(start));
            permutationsHelper(list, r, start + 1, current, allPermutations);
            current.remove(current.size() - 1);
            Collections.swap(list, start, i);
        }
    }

    // Other functions such as combinations, product can be similarly written by
    // iterating over the elements in a nested loop manner and generating the desired combinations.

    // Note: The translation is given for the `main` function and additional helper methods are provided
    // for context. The original Python code has imports for a lot of utility methods and data structures
    // which may need to be manually implemented or substituted with Java's standard library methods
    // when needed.
}
```
Please note that Java's approach to programming is considerably different from Python's. For instance, in the given Python code there are global lambda expressions used for input parsing which is not a common practice in Java. Thus, the conventional Java approach has been followed for the `main` method, while trying to be as true as possible to the logic in the Python code.

Additionally, Java does not have built-in equivalents for Python's `collections`, `itertools`, or `operator` modules, so those would need to be implemented manually or approximated with available Java libraries and language features.

The commented sections provide stubs for some of the functions and methods which correspond to some of the Python modules used. However, full implementations for those helper methods are beyond the scope of the provided translation and might not be needed depending on the actual use case.
