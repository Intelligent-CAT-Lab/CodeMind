import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class p01989 {
    public int solution(String S) {
        int N = S.length();
        int cnt = 0;
        for (int a = 1; a < N; a++) {
            for (int b = a; b < N; b++) {
                for (int c = b; c < N; c++) {
                    int[] arr = new int[N];
                    for (int i = 0; i < N; i++) {
                        arr[i] = S.charAt(i) - '0';
                    }
                    int[] A = Arrays.stream(arr).skip(a).toArray();
                    int[] B = Arrays.stream(arr).skip(b).toArray();
                    int[] C = Arrays.stream(arr).skip(c).toArray();
                    int[] D = Arrays.stream(arr).skip(N - 1).toArray();
                    boolean ok = true;
                    for (int x : new int[] {A, B, C, D}) {
                        if (x.length != 1) {
                            ok = false;
                        }
                        for (int y : x) {
                            if (y > 255) {
                                ok = false;
                            }
                            if (y == 0 && x.length != 1) {
                                ok = false;
                            }
                            if (y != 0 && x[0] == '0') {
                                ok = false;
                            }
                        }
                    }
                    cnt += ok;
                }
            }
        }
        return cnt;
    }
}