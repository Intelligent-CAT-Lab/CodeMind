Below is the Java translation of the provided Python code. The logic and structure have been preserved and translated into Java’s syntax and idioms, including the use of a `Scanner` object for input and `System.out.println` for output:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        
        if (k % 10 == 0 || k % 10 == 2 || k % 10 == 4 || k % 10 == 5 || k % 10 == 6 || k % 10 == 8) {
            System.out.println(-1);
        } else if (k % 10 == 1) {
            long tmp = k * 7L;
            int ans = 1;
            while (true) {
                if (allSevens(tmp)) {
                    System.out.println(ans + String.valueOf(tmp).length() - 1);
                    break;
                }
                int num;
                int nextDigit = (int)((tmp / 10) % 10);
                if (nextDigit <= 7) {
                    num = 7 - nextDigit;
                } else if (nextDigit == 8) {
                    num = 9;
                } else {
                    num = 8;
                }
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
                if (allSevens(tmp)) {
                    System.out.println(ans + String.valueOf(tmp).length() - 1);
                    break;
                }
                int num = (((int)((tmp / 10) % 10)) * 3 - 1) % 10;
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
                if (allSevens(tmp)) {
                    System.out.println(ans + String.valueOf(tmp).length() - 1);
                    break;
                }
                int num = (((int)((tmp / 10) % 10)) * 7 + 1) % 10;
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
                if (allSevens(tmp)) {
                    System.out.println(ans + String.valueOf(tmp).length() - 1);
                    break;
                }
                int num = (((int)((tmp / 10) % 10)) + 3) % 10;
                long tmp2 = k * num;
                tmp = tmp / 10 + tmp2;
                ans++;
                if (ans > k) {
                    System.out.println(-1);
                    break;
                }
            }
        }
        
        scanner.close();
    }
    
    private static boolean allSevens(long number) {
        String numStr = String.valueOf(number);
        for (int i = 0; i < numStr.length(); i++) {
            if (numStr.charAt(i) != '7') {
                return false;
            }
        }
        return true;
    }
}
```

This implementation uses a helper function `allSevens()` to check if all digits in a number are 7's. The function reads the input from the user using a `Scanner`, and uses `long` for variable `tmp` and `tmp2` to ensure that it can hold larger values that might result from the multiplications and additions in the algorithm. The output is sent to `System.out` with `System.out.println()`.
