import java.math.BigInteger;
import java.util.Arrays;

public class p01979 {
    private static final BigInteger INF = BigInteger.valueOf((long)Math.pow(10, 18));
    private static final BigInteger MOD = BigInteger.valueOf((long)Math.pow(10, 9) + 7);

    public static void main(String[] args) {
        String N = "5124"; // Replace this with input, e.g., using a Scanner

        char[] S = new char[20];
        Arrays.fill(S, '?');
        BigInteger result = func(S, 0, 0, new BigInteger(N));
        System.out.println(result);
    }

    public static BigInteger func(char[] S, int index, int cnt, BigInteger N) {
        BigInteger ans = BigInteger.ZERO;
        if (index == 20) {
            if (cnt == 0) {
                return BigInteger.ZERO;
            }
            char[] S_ = Arrays.copyOf(S, S.length);
            for (int i = 0; i < 20; i++) {
                if (S_[i] != '?') {
                    continue;
                }
                for (int j = 0; j < 10; j++) {
                    S_[i] = (char) ('0' + j);
                    if (new BigInteger(new String(S_).replace('?', '9')).compareTo(N) > 0) {
                        break;
                    } else {
                        ans = ans.add(BigInteger.TEN.pow(countChar(S_, '?')));
                    }
                }
                S_[i] = '?'; // Reset after loop
            }
            if (cnt % 2 == 0) {
                ans = ans.negate();
            }
            return ans;
        }
        ans = ans.add(func(S, index + 1, cnt, N));
        if (index <= 16) {
            char[] S_ = Arrays.copyOf(S, S.length);
            S_[index] = '5';
            S_[index + 1] = '1';
            S_[index + 3] = '3';
            ans = ans.add(func(S_, index + 4, cnt + 1, N));
        }
        return ans;
    }

    private static int countChar(char[] arr, char c) {
        int count = 0;
        for (char value : arr) {
            if (value == c) {
                count++;
            }
        }
        return count;
    }
}