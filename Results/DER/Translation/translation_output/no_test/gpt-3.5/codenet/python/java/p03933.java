```java
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] inputLine = br.readLine().split(" ");
        int N = Integer.parseInt(inputLine[0]);
        int K = Integer.parseInt(inputLine[1]);
        
        double theta = Math.PI/N;
        
        double left = 0;
        double right = 4;
        
        for (int i = 0; i < 100; i++) {
            double x = (left + right) / 2;
            if (test(x, N, theta, K)) {
                left = x;
            } else {
                right = x;
            }
        }
        
        System.out.println(right);
    }
    
    public static boolean test(double x, int N, double theta, int K) {
        double[] A = new double[N-1];
        for (int i = 1; i < N-1; i++) {
            A[i] = i;
        }
        
        double[] sA = new double[N-1];
        for (int i = 1; i < N-1; i++) {
            sA[i] = Math.sin(A[i] * theta);
        }
        
        double[] diff = new double[N-1];
        for (int i = 1; i < N-1; i++) {
            if (sA[i] != 0) {
                diff[i] = Math.acos(x/sA[i] - Math.cos(A[i]*theta)) / theta;
            } else {
                diff[i] = -(N + N);
            }
        }
        
        int[] upper = new int[N-1];
        int[] lower = new int[N-1];
        for (int i = 1; i < N-1; i++) {
            upper[i] = (int) Math.min(N-A[i]-1, (N-A[i]+diff[i])/2);
            lower[i] = (N-A[i]) - upper[i];
        }
        
        int cnt = 0;
        for (int i = 1; i < N-1; i++) {
            cnt += Math.max(0, upper[i] - lower[i] + 1);
        }
        
        return N*((N-1)*(N-2)/2 - cnt) < 3*K;
    }
}
```
