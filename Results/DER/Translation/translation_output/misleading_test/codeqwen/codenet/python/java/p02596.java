Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        if (k % 10 == 0 || k % 10 == 2 || k % 10 == 4 || k % 10 == 5 || k % 10 == 6 || k % 10 == 8) {
            System.out.println(-1);
        } else if (k % 10 == 1) {
            int tmp = k * 7;
            int ans = 1;
            while (true) {
                if (countSevens(tmp) == tmp.toString().length()) {
                    System.out.println(ans + tmp.toString().length() - 1);
                    break;
                }
                int num = 0;
                if (tmp % 10 <= 7) {
                    num = 7 - tmp % 10;
                } else if (tmp % 10 == 8) {
                    num = 9;
                } else if (tmp % 10 == 9) {
                    num = 8;
                }
                int tmp2 = k * num;
                tmp = tmp / 10 + tmp2;
                ans += 1;
                if (ans > k) {
                    System.out.println(-1);
                    break;
                }
            }
        } else if (k % 10 == 3) {
            int tmp = k * 9;
            int ans = 1;
            while (true) {
                if (countSevens(tmp) == tmp.toString().length()) {
                    System.out.println(ans + tmp.toString().length() - 1);
                    break;
                }
                int num = ((tmp / 10) % 10) * 3 - 1;
                num = num % 10;
                int tmp2 = k * num;
                tmp = tmp
