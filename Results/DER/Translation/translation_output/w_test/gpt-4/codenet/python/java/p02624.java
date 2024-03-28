Here is the equivalent Java code for the provided Python code:

```java
import java.io.*;

class DSumOfDivisors {

    public void solve(int tc) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            int n = Integer.parseInt(reader.readLine());

            int result = 0;
            for (int k = 1; k <= n; k++) {
                result += k / 2 * (n / k) * (1 + n / k);
            }

            System.out.println(result);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        DSumOfDivisors solver = new DSumOfDivisors();
        solver.solve(0);
    }
}
```
Please note a couple of important changes:

1. Java requires type information, so variables are declared with their types.
2. Java's `System.in` is used in place of `sys.stdin`, wrapped with a `BufferedReader` for line input.
3. Instead of Python's `print`, we use `System.out.println` to print to standard output in Java.
4. The division operation in Java with integers performs an integer division by default; we don't need to convert the result to `int` explicitly as in Python since there's no fractional part.

To compile and run this Java code, you must have a Java Development Kit (JDK) installed. You would typically save the code in a file named `DSumOfDivisors.java`, then compile it with `javac DSumOfDivisors.java`, and run it with `java DSumOfDivisors`, providing the test input (4 in your case) redirected from a file or typed manually when prompted.
