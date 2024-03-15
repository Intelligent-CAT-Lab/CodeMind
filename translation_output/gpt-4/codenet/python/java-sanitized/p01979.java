import java.util.*;
import java.math.BigInteger;

public class p01979 {
    private static final BigInteger INF = new BigInteger("10000000000000000000");
    private static final BigInteger MOD = BigInteger.valueOf(1000000007);
    private static BigInteger N;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        N = new BigInteger(scanner.next());

        // We generally do not need to set the recursion limit in Java,
        // but if required, it can be done by increasing the stack size
        // using the -Xss flag during JVM launch.

        char[] S = new char[20];
        Arrays.fill(S, '?');
        System.out.println(func(S, 0, 0));
        scanner.close();
    }

    private static BigInteger func(char[] S, int index, int cnt) {
        BigInteger ans = BigInteger.ZERO;
        if (index == 20) {
            if (cnt == 0) {
                return BigInteger.ZERO;
            }
            char[] SClone = Arrays.copyOf(S, S.length);
            for (int i = 0; i < 20; i++) {
                if (SClone[i] != '?') continue;
                for (int j = 0; j < 10; j++) {
                    SClone[i] = Character.forDigit(j, 10);
                    String current = new String(SClone).replace('?', '9');
                    if (new BigInteger(current).compareTo(N) > 0) {
                        break;
                    } else {
                        ans = ans.add(BigInteger.valueOf(10).pow(countQuestionMarks(SClone)));
                    }
                }
                SClone[i] = '?'; // Reset back to question mark after iteration
            }
            ans = ans.multiply(BigInteger.valueOf(cnt % 2 == 0 ? 1 : -1));
            return ans;
        }

        ans = ans.add(func(S, index + 1, cnt));

        if (index <= 16) {
            char[] SClone = Arrays.copyOf(S, S.length);
            SClone[index] = '5';
            SClone[index + 1] = '1';
            SClone[index + 3] = '3';
            ans = ans.add(func(SClone, index + 4, cnt + 1));
        }

        return ans;
    }

    private static int countQuestionMarks(char[] arr) {
        int count = 0;
        for (char c : arr) {
            if (c == '?') {
                count++;
            }
        }
        return count;
    }
}