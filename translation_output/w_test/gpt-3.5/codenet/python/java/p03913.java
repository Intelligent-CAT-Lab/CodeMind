```java
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int A = Integer.parseInt(st.nextToken());

        int answer = Integer.MAX_VALUE;
        for (int K = 1; K < 50; K++) {
            int cost = F(N, A, K);
            answer = Math.min(answer, cost);
        }

        System.out.println(answer);
    }

    public static int F(int N, int A, int K) {
        int n = (int) Math.pow(N, 1.0 / K);
        while ((n - 1) * Math.pow(n, K - 1) > N) {
            n -= 1;
        }
        while (n * Math.pow(n + 1, K - 1) < N){
            n += 1;
        }
        
        int x = 0, y = 0;
        for (int i = 0; i < K; i++) {
            x = K - i;
            y = i;
            if (Math.pow(n, x) * Math.pow(n + 1, y) >= N) {
                break;
            }
        }

        int cost = A * (K - 1) + n * x + (n + 1) * y;
        return cost;
    }
}
```

