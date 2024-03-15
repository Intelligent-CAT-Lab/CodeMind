Here is the provided Python code translated into Java. I’ve kept the main logic and flow of the code, translating Python-specific constructs to their equivalent or similar Java code:

```java
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static int mod = (int) 1e9 + 7;
    
    public static int getN() throws IOException {
        return Integer.parseInt(br.readLine().trim());
    }
    
    public static int[] getNM() throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] nm = new int[2];
        nm[0] = Integer.parseInt(st.nextToken());
        nm[1] = Integer.parseInt(st.nextToken());
        return nm;
    }
    
    public static int[] getList() throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] list = new int[st.countTokens()];
        for (int i = 0; i < list.length; i++) {
            list[i] = Integer.parseInt(st.nextToken());
        }
        return list;
    }
    
    public static int[] getArray(int intn) throws IOException {
        int[] arr = new int[intn];
        for (int i = 0; i < intn; i++) {
            arr[i] = Integer.parseInt(br.readLine().trim());
        }
        return arr;
    }

    public static void main(String[] args) throws IOException {
        int[] nm = getNM();
        int N = nm[0];
        int M = nm[1];
        int total = 1900 * M + 100 * (N - M);
        System.out.println(total * (1 << M));
    }
}
```

A few points to take note of with the conversion:

- Java has a different way of handling input/output, using `BufferedReader` for efficient reading.
- Function `getN()` is equivalent to the Python `getN()` function, but it reads an integer from the standard input in Java.
- In the function `getNM()`, the StringTokenizer is being used to parse two integers from a single line, as opposed to `map` in Python.
- The function `getList()` reads a line and splits it into an array of integers in Java.
- Similarly, `getArray(intn)` function reads `intn` integers, one per line, and stores them into an array.
- The Java equivalent of Python's bit shift-left operation `2 ** M` is `1 << M`.
- Java does not need to set the recursion limit, as the default limit is usually sufficient for common use-cases, and we do not modify the global modulo variable as Python might do.

Remember that Java requires a main method to execute the program, which I have included. The I/O operation may throw an `IOException`, which is why the `throws IOException` clause is added to the methods that perform I/O operations.
