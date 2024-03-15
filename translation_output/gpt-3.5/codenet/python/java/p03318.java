```java
import java.util.*;
import java.io.*;

public class Solution {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        D();
    }

    static void D() throws IOException {
        int K = Integer.parseInt(br.readLine());
        int ans = 1;
        int i = 0;

        while (K > 0) {
            bw.write(ans + "\n");
            K--;

            if (Sunuke(ans + (int)Math.pow(10, i)) > Sunuke(ans + (int)Math.pow(10, i + 1))) {
                i++;
            }

            ans += Math.pow(10, i);
        }

        bw.flush();
    }

    static double Sunuke(int a) {
        String numStr = String.valueOf(a);
        int sum = 0;
        for (char c : numStr.toCharArray()) {
            sum += Character.getNumericValue(c);
        }
        return (double) a / sum;
    }
}
```
This is the translation of the given Python code to Java. The main focus is on the `D()` method where the logic from the original Python function is replicated in Java. The `Sunuke()` method calculates the Sunuke value as in the original code. Just like in the original code, this Java solution reads an integer `K` from the standard input and runs the `D()` function to print the output as described in the problem statement.
