```java
import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] s = input.nextLine().split(" ");
        String str = s[0];
        int n = str.length();
        int now = 1;
        int[] amari = new int[n];
        for (int i = 0; i < n; i++) {
            amari[i] = now;
            now = (now * 10) % 13;
        }
        int[][] ans = new int[2][13];
        ans[0][0] = 1;
        ans[1][0] = 1;
        for (int i = 0; i < n; i++) {
            char nowChar = str.charAt(n - 1 - i);
            int[][] temp = new int[2][13];
            Arrays.fill(temp[0], 0);
            if (nowChar == '?') {
                for (int k = 0; k < 10; k++) {
                    int plus = (amari[i] * k) % 13;
                    for (int j = 0; j < 13; j++) {
                        temp[1][(j + plus) % 13] += ans[0][j];
                        temp[1][(j + plus) % 13] %= 1000000007;
                    }
                }
            } else {
                int nowInt = Character.getNumericValue(nowChar);
                int plus = (amari[i] * nowInt) % 13;
                for (int j = 0; j < 13; j++) {
                    temp[1][(j + plus) % 13] = ans[0][j];
                }
            }
            ans = temp;
        }
        int last = 1;
        System.out.println(ans[last][5]);
    }
}
```
