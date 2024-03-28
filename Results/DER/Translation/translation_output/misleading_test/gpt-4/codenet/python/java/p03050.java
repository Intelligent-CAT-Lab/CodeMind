Here's the translated code from Python to Java:

```java
import java.util.Scanner;
import java.util.ArrayList;

public class SampleProblem {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int n = (int) Math.sqrt(N);

        ArrayList<Integer> plist = new ArrayList<>();
        for (int i = 1; i <= n; ++i) {
            if (N % i == 0) {
                plist.add(i);
                if (i != N / i) {
                    plist.add(N / i);
                }
            }
        }

        int ans = 0;
        for (int i = 0; i < plist.size(); ++i) {
            int x = plist.get(i);
            int kari = (N / x) - 1;
            if (kari != 0) {
                int q = N / kari;
                int r = N % kari;
                if (q == r) {
                    ans += kari;
                }
            }
        }

        System.out.println(ans);
        scanner.close();
    }
}
```

This Java program will mimic the behavior of the provided Python code. It takes an integer as input and calculates the answer based on the described logic, finally printing the result to the standard output.
