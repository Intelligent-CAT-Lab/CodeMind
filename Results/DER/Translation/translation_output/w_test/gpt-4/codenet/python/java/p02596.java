Here is the Java equivalent of the Python code you provided:

```java
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int k = Integer.parseInt(reader.readLine());
        if (k % 10 == 0 || k % 10 == 2 || k % 10 == 4 || k % 10 == 5 || k % 10 == 6 || k % 10 == 8) {
            System.out.println(-1);
        } else if (k % 10 == 1) {
            long tmp = k * 7L;
            int ans = 1;
            while (true) {
                if (String.valueOf(tmp).chars().allMatch(ch -> ch == '7')) {
                    System.out.println(ans + String.valueOf(tmp).length() - 1);
                    break;
                }
                long num = tmp / 10 % 10 <= 7 ? 7 - tmp / 10 % 10 : (tmp / 10 % 10 == 8 ? 9 : 8);
                long tmp2 = k * num;
                tmp = tmp / 10 + tmp2;
                ans++;
                if (ans > k) {
                    System.out.println(-1);
                    break;
                }
            }
        } else if (k % 10 == 3) {
            long tmp = k * 9L;
            int ans = 1;
            while (true) {
                if (String.valueOf(tmp).chars().allMatch(ch -> ch == '7')) {
                    System.out.println(ans + String.valueOf(tmp).length() - 1);
                    break;
                }
                long num = (((tmp / 10 % 10) * 3) - 1) % 10;
                long tmp2 = k * num;
                tmp = tmp / 10 + tmp2;
                ans++;
                if (ans > k) {
                    System.out.println(-1);
                    break;
                }
            }
        } else if (k % 10 == 7) {
            long tmp = k;
            int ans = 1;
            while (true) {
                if (String.valueOf(tmp).chars().allMatch(ch -> ch == '7')) {
                    System.out.println(ans + String.valueOf(tmp).length() - 1);
                    break;
                }
                long num = (((tmp / 10 % 10) * 7) + 1) % 10;
                long tmp2 = k * num;
                tmp = tmp / 10 + tmp2;
                ans++;
                if (ans > k) {
                    System.out.println(-1);
                    break;
                }
            }
        } else if (k % 10 == 9) {
            long tmp = k * 3L;
            int ans = 1;
            while (true) {
                if (String.valueOf(tmp).chars().allMatch(ch -> ch == '7')) {
                    System.out.println(ans + String.valueOf(tmp).length() - 1);
                    break;
                }
                long num = (((tmp / 10 % 10) + 3) % 10);
                long tmp2 = k * num;
                tmp = tmp / 10 + tmp2;
                ans++;
                if (ans > k) {
                    System.out.println(-1);
                    break;
                }
            }
        }
    }
}
```

This Java program takes an integer from the standard input, performs the same operations as the Python code, and prints the result to the standard output. To simulate the behavior of `sys.stdin.readline()` in Python, I used `BufferedReader` combined with `InputStreamReader` for efficient reading of the input.

Please note that I've used a `long` type for the variable `tmp` instead of `int` to handle possible overflow for larger calculations, as in the original Python code integers are unbounded. Similarly, `String.valueOf(tmp).chars().allMatch(ch -> ch == '7')` is used to check if all characters in the string are '7', replacing `str(tmp).count("7") == len(str(tmp))` in Python.
