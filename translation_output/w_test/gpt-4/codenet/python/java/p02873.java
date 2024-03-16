Here is the translated Java code snippet:

```java
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S = br.readLine().trim();

        int n = S.length() + 1;
        int[] sho = new int[n];
        int[] dai = new int[n];

        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == '>') {
                sho[i + 1] = 0;
            } else {
                sho[i + 1] = sho[i] + 1;
            }
        }

        for (int i = S.length() - 1; i >= 0; i--) {
            if (S.charAt(i) == '<') {
                dai[i] = 0;
            } else {
                dai[i] = dai[i + 1] + 1;
            }
        }

        int[] seq = new int[n];
        long sum = 0;
        for (int i = 0; i < n; i++) {
            seq[i] = Math.max(sho[i], dai[i]);
            sum += seq[i];
        }

        System.out.println(sum);
    }
}
```

Please ensure to have proper exception handling in place when doing I/O in a real application and also note that this code is expecting the input to be provided in the same format as it is read in the original Python code (a single line with `<` and `>` characters). When running it from the console, you should type the input and then press Enter to get the result.
