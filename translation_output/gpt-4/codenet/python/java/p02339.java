```java
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static final int MOD = (int) 1e9 + 7;
    
    public static int I() throws IOException {
        return Integer.parseInt(nextToken());
    }
    
    public static long L() throws IOException {
        return Long.parseLong(nextToken());
    }
    
    public static float F() throws IOException {
        return Float.parseFloat(nextToken());
    }
    
    public static double D() throws IOException {
        return Double.parseDouble(nextToken());
    }
    
    public static String S() throws IOException {
        return nextToken();
    }
    
    public static int[] LI() throws IOException {
        return readIntArray(nextToken(), 0);
    }
    
    public static int[] LI_(int subtract) throws IOException {
        return readIntArray(nextToken(), subtract);
    }
    
    public static float[] LF() throws IOException {
        return readFloatArray(nextToken());
    }
    
    public static String[] LSS() throws IOException {
        return nextToken().split(" ");
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(reader.readLine());
        resolve();
        reader.close();
    }

    static StringTokenizer st;

    static String nextToken() throws IOException {
        while (!st.hasMoreTokens()) {
            st = new StringTokenizer(br.readLine());
        }
        return st.nextToken();
    }

    static int[] readIntArray(String s, int subtract) {
        StringTokenizer st = new StringTokenizer(s);
        int[] arr = new int[st.countTokens()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(st.nextToken()) - subtract;
        }
        return arr;
    }

    static float[] readFloatArray(String s) {
        StringTokenizer st = new StringTokenizer(s);
        float[] arr = new float[st.countTokens()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Float.parseFloat(st.nextToken());
        }
        return arr;
    }

    static void resolve() throws IOException {
        int n = I();
        int k = I();

        int[][] dp = new int[n + 1][k + 1];
        dp[0][0] = 1;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < k; j++) {
                dp[i+1][j+1] = (dp[i][j] + (int)(((long)(j + 1) * dp[i][j+1]) % MOD)) % MOD;
            }
        }

        System.out.println(dp[n][k]);
    }

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
}
```
