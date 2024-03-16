Here's the equivalent Java code for the given Python script:

```java
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
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
            int kari = N / x - 1;
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

This Java code includes all the functionalities of the given Python script:

- Reading the input integer `N`.
- Finding all divisors of `N` and storing them in a list `plist`.
- Calculating the value `ans` according to the condition given in the Python script.
- Printing the computed value of `ans`.

Please note that, unlike in Python, the use of `Scanner` for input necessitates closing the scanner object at the end of the usage to prevent resource leaks.
