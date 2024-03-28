```java
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        D();
    }

    static void D() throws IOException {
        int K = Integer.parseInt(br.readLine());
        int ans = 1;
        int i = 0;

        while (K > 0) {
            System.out.println(ans);
            K--;

            i += Check(ans, i);
            ans += Math.pow(10, i);
        }
    }

    static double Sunuke(int a) {
        String numString = String.valueOf(a);
        int sum = 0;
        for (int i = 0; i < numString.length(); i++) {
            sum += Character.getNumericValue(numString.charAt(i));
        }
        return (double) a / sum;
    }

    static int Check(int a, int i) {
        return Sunuke(a + (int) Math.pow(10, i)) > Sunuke(a + (int) Math.pow(10, i + 1)) ? 1 : 0;
    }
}
```

