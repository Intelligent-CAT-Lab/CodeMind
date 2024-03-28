```java
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int S = Integer.parseInt(st.nextToken());

        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = S;
        }

        if (S == (int)Math.pow(10, 9)) {
            for (int i = 0; i < N - K; i++) {
                A[i] = S - 1;
            }
        } else {
            for (int i = 0; i < N - K; i++) {
                A[i] = (int)Math.pow(10, 9);
            }
        }

        for (int num : A) {
            System.out.print(num + " ");
        }
    }
}
```  
