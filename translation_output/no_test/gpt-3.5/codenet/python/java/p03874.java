```java
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class PatternConversion {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int k = Integer.parseInt(br.readLine());

        int n = 512;
        int pattern = 0;
        ArrayList<Integer> a = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int val = factorial(7 + i) / (factorial(i) * factorial(7));
            a.add(val);
        }
        Collections.reverse(a);

        int cnt = 600 * 7;
        String[] ans = new String[n];
        for (int i = 0; i < n; i++) {
            ans[i] = "FESTIVA";
        }

        Collections.reverse(a);
        for (int i = 0; i < n; i++) {
            int item = a.get(i);
            ans[i] += "L".repeat(k / item);
            k %= item;
        }
        
        // Print the result
        StringBuilder result = new StringBuilder();
        for (String item : ans) {
            result.append(item);
        }
        System.out.println(result.toString());
    }

    private static int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
```

