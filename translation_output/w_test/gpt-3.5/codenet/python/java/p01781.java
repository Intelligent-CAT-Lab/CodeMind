```java
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        
        int X = Integer.parseInt(input[0]);
        int Y = Integer.parseInt(input[1]);
        int Z = Integer.parseInt(input[2]);
        int A = Integer.parseInt(input[3]);
        int B = Integer.parseInt(input[4]);
        int C = Integer.parseInt(input[5]);
        int N = Integer.parseInt(input[6]);
        
        int[] S = new int[Math.max(2*(X+Y+Z+1), 2*N+2)];
        for (int k = 0; k < N; k++) {
            S[k] = k*(k+1)/2;
        }
        for (int k = N; k < X+Y+Z+1; k++) {
            S[k] = k*(k+1)/2 + S[k-N];
        }

        int[] ans = new int[N];
        for (int b = 0; b < N; b++) {
            int k = (X+Y+Z - b - 1) / N * N + b;
            ans[b] = (
                calc(k+1, X-A, Y-B, Z-C, S) +
                calc(k, A, Y-B, Z-C, S) +
                calc(k, X-A, B, Z-C, S) +
                calc(k, X-A, Y-B, C, S) +
                calc(k-1, A, B, Z-C, S) +
                calc(k-1, X-A, B, C, S) +
                calc(k-1, A, Y-B, C, S) +
                calc(k-2, A, B, C, S)
            );
        }

        for (int i = 0; i < N; i++) {
            System.out.print(ans[i] + " ");
        }
        System.out.println();
    }

    private static int calc(int k, int x, int y, int z, int[] S) {
        return S[k] - S[k-x] - S[k-y] - S[k-z] + S[k-(x+y)] + S[k-(y+z)] + S[k-(z+x)] - S[k-(x+y+z)];
    }
}
```
