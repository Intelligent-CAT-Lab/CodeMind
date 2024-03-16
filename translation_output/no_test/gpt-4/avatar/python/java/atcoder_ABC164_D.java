Here is the Python code translated into Java:

```java
import java.io.*;
import java.util.*;

public class Main {
    private static final int MOD = 1000000007;
    private static final int INF = Integer.MAX_VALUE;
    private static final int[] DR = new int[]{1, -1, 0, 0};
    private static final int[] DC = new int[]{0, 0, 1, -1};

    private static int[] readInts() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputs = br.readLine().trim().split("\\s+");
        int[] arr = new int[inputs.length];
        for (int i = 0; i < inputs.length; i++) {
            arr[i] = Integer.parseInt(inputs[i]);
        }
        return arr;
    }

    private static long[] readLongs() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputs = br.readLine().trim().split("\\s+");
        long[] arr = new long[inputs.length];
        for (int i = 0; i < inputs.length; i++) {
            arr[i] = Long.parseLong(inputs[i]);
        }
        return arr;
    }

    private static double[] readDoubles() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputs = br.readLine().trim().split("\\s+");
        double[] arr = new double[inputs.length];
        for (int i = 0; i < inputs.length; i++) {
            arr[i] = Double.parseDouble(inputs[i]);
        }
        return arr;
    }

    private static String[] readStrings() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        return br.readLine().trim().split("\\s+");
    }

    private static int readInt() throws IOException {
        return Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine().trim());
    }

    private static long readLong() throws IOException {
        return Long.parseLong(new BufferedReader(new InputStreamReader(System.in)).readLine().trim());
    }

    private static double readDouble() throws IOException {
        return Double.parseDouble(new BufferedReader(new InputStreamReader(System.in)).readLine().trim());
    }

    private static String readString() throws IOException {
        return new BufferedReader(new InputStreamReader(System.in)).readLine().trim();
    }

    public static void main(String[] args) throws IOException {
        String s = readString();
        int k = 2019;
        int[] tens = new int[s.length() + 1];
        tens[0] = 1;
        for (int i = 1; i <= s.length(); i++) {
            tens[i] = (tens[i - 1] * 10) % k;
        }
        int[] mods0toi = new int[s.length()];
        int cur = 0;
        for (int i = s.length() - 1; i >= 0; --i) {
            int j = s.length() - i - 1;
            mods0toi[i] = (cur + (s.charAt(i) - '0') * tens[j]) % k;
            cur = mods0toi[i];
        }
        Map<Integer, Integer> count = new HashMap<>();
        for (int mod : mods0toi) {
            count.put(mod, count.getOrDefault(mod, 0) + 1);
        }
        int ans = count.getOrDefault(0, 0);
        for (int c : count.values()) {
            ans += (c * (c - 1)) / 2;
        }
        System.out.println(ans);
    }
}
```

Please note that I've used `HashMap` to mimic the behavior of `collections.Counter`. Additionally, Java does not have an equivalent of `sys.stdin`, so I've written utility functions to read different types of input. Java also does not have a built-in factorial function, so you need to handle factorial calculations separately if needed. The standard Java stack size is usually sufficient for most applications, but if you need to set the recursion limit as in the Python code, this has to be done when you run the Java program with a command line argument (for example: `-Xss2m` to set the stack size to 2 megabytes).

Before running the code, it is important to note that the BufferedReader used here does not correspond exactly to the `sys.stdin` object from Python, so it's best to tailor this part of the input handling to the specific context in which the program is executed, such as competitive programming websites or reading from files.
