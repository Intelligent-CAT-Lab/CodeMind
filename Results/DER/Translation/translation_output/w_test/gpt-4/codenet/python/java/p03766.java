Here's the equivalent Java code for the given Python script:

```java
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();

        if (n == 1) {
            System.out.println(1);
        } else {
            int[] res_v = new int[n + 1];
            int[] res_v_cumsum = new int[n + 1];
            res_v[0] = 0;
            res_v[1] = 1;
            res_v[2] = 1;
            res_v_cumsum[0] = 0;
            res_v_cumsum[1] = 1;
            res_v_cumsum[2] = 2;

            final int M = 1000000007;

            for (int k = 3; k < n; k++) {
                res_v[k] = (1 + res_v_cumsum[k - 1] - res_v[k - 2] + M) % M;
                res_v_cumsum[k] = (res_v_cumsum[k - 1] + res_v[k]) % M;
            }
            // To mimic the print of 'res_v' array in Python code, uncomment the line below.
            // System.out.println(Arrays.toString(res_v));
            
            long result = (((long)res_v_cumsum[n - 2] * ((long)(n - 1) * (n - 1) % M) % M)
                    + ((long)res_v_cumsum[n - 1] * (n - 1) % M)
                    + n + (long)(n - 1) * (n - 1) % M) % M;
            System.out.println(result);
        }
    }
}
```

Remember to put this code in a file named `Main.java`, since the class is public and named `Main`. Also, if you are running it in an environment other than a local development setup, the class and file name may need to be adjusted according to the requirements of the environment.
