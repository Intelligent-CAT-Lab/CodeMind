```java
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String[] input = br.readLine().trim().split(" ");
            int N = Integer.parseInt(input[0]);
            int K = Integer.parseInt(input[1]);

            int s = 0;
            for (int b = K + 1; b <= N; b++) {
                int an = 0;
                int j = N / b;
                an = j * (b - K);
                
                if (N % b > 0) {
                    int x1 = j * b + K;
                    if (K == 0) {
                        x1 += 1;
                    }
                    int x2 = Math.min(N, (j + 1) * b - 1);
                    
                    if (x2 >= x1) {
                        an += (x2 - x1 + 1);
                    }
                }
                s += an;
            }
            System.out.println(s);
        }
    }
}
```
