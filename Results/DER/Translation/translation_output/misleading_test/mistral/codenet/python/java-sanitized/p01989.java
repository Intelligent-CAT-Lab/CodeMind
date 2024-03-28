import java.util.Arrays;
import java.util.stream.IntStream;

public class p01989 {
    public static void main(String[] args) {
        String S = "123456789";
        int N = S.length();
        int cnt = 0;

        for (int[] a : IntStream.range(1, N - 2)
                .parallel()
                .map(i -> new int[]{S.substring(0, i), S.substring(i, i + 2), S.substring(i + 2)})
                .filter(x -> isValid(x))
                .toArray(int[][]::new)) {
            cnt += isValid(a);
        }

        System.out.println(cnt);
    }

    private static boolean isValid(int[] a) {
        for (int x : a) {
            if (x > 255) {
                return false;
            }
            if (x == 0 && a.length != 1) {
                return false;
            }
            if (a[0] == '0' && x != 0) {
                return false;
            }
        }
        return true;
    }
}