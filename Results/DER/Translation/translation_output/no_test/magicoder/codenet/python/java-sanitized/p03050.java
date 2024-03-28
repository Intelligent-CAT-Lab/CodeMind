import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class p03050 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int n = (int) Math.sqrt(N);
        List<Integer> plist = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (N % i == 0) {
                plist.add(i);
                if (i != N / i) {
                    plist.add(N / i);
                }
            }
        }
        int ans = 0;
        for (int i = 0; i < plist.size(); i++) {
            int x = plist.get(i);
            int kari = N / x - 1;
            if (kari == 0) {
                continue;
            } else {
                int q = N / kari;
                int r = N % kari;
                if (q == r) {
                    ans += kari;
                }
            }
        }
        System.out.println(ans);
    }
}