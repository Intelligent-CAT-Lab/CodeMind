```java
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputLine = br.readLine().split(" ");
        int N = Integer.parseInt(inputLine[0]);
        int A = Integer.parseInt(inputLine[1]);

        int answer = Integer.MAX_VALUE;

        for (int K = 1; K <= 50; K++) {
            int cost = F(N, A, K);
            answer = Math.min(answer, cost);
        }

        System.out.println(answer);
    }

    public static int F(int N, int A, int K) {
        int n = (int) Math.pow(N, 1.0 / K);

        while((n - 1) * Math.pow(n, K - 1) > N) {
            n--;
        }

        while(n * Math.pow(n + 1, K - 1) < N) {
            n++;
        }

        int x = 0;
        int y = 0;
        for(int i = K - 1; i >= 0; i--) {
            x = i;
            y = K - 1 - i;
            if (Math.pow(n, x) * Math.pow(n + 1, y) >= N) {
                break;
            }
        }

        int cost = A * (K - 1) + n * x + (n + 1) * y;
        return cost;
    }
}
```
