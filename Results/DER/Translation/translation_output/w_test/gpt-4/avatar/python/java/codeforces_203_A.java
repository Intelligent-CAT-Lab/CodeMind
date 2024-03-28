Below is the translated Java code from the provided Python code, enclosed within ```java``` as requested.

```java
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    static int ii() throws IOException {
        return Integer.parseInt(br.readLine().trim());
    }

    static int[] mi() throws IOException {
        st = new StringTokenizer(br.readLine());
        int[] arr = new int[st.countTokens()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        return arr;
    }

    public static void main(String[] args) throws IOException {
        int[] values = mi();
        int d = values[0], t = values[1], a = values[2], b = values[3], da = values[4], db = values[5];
        solve(d, t, a, b, da, db);
    }

    public static void solve(int d, int t, int a, int b, int da, int db) {
        for (int i = 0; i < t; i++) {
            for (int j = 0; j < t; j++) {
                if (a - da * i + b - db * j == d || a - da * i == d || b - db * j == d || d == 0) {
                    System.out.println("YES");
                    return;
                }
            }
        }
        System.out.println("NO");
    }
}
```

Explanation:
Since Java is statically typed, we must define the type of each variable. The I/O operations are a bit more verbose in Java than Python. The lambda expressions have been replaced with regular methods that achieve the same result. We've also added throws IOException to the methods that perform I/O operations because Java requires us to either handle or declare these exceptions.

The functionality of the code remains the same as in the Python code. It reads the input, splits it into integers, and passes these values to a `solve` method that checks if it's possible to achieve the desired sum `d` with the provided parameters. If it is possible, it prints "YES"; otherwise, it prints "NO".
