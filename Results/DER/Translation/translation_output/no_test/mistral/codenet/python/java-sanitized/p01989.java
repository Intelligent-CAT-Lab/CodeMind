import java.util.Arrays;
import java.util.stream.IntStream;

public class p01989 {
    public static void main(String[] args) {
        String S = System.console().readLine();
        int N = S.length();
        int cnt = 0;

        for (int[] a : IntStream.range(1, N - 2)
                .parallel()
                .map(x -> new int[]{x, x + 1, x + 2})
                .filter(x -> S.substring(x[0], x[1]).equals("0") && S.substring(x[1], x[2]).equals("0") && S.substring(x[2], x[3]).equals("0"))
                .filter(x -> isValid(S.substring(x[0], x[1]), x[0]) && isValid(S.substring(x[1], x[2]), x[1]) && isValid(S.substring(x[2], x[3]), x[2])) {
            cnt++;
        }

        System.out.println(cnt);
    }

    private static boolean isValid(String s, int start) {
        int len = s.length();
        int sum = 0;
        for (int i = start; i < len; i++) {
            char c = s.charAt(i);
            if (c == '0') {
                sum++;
            } else {
                sum -= 10;
            }
        }
        return sum == 0;
    }
}