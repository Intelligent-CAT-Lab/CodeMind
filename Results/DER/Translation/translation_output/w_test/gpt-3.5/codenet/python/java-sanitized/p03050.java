import java.util.Scanner;

public class p03050 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int n = (int) Math.sqrt(N);
        int[] plist = new int[2 * n];
        int index = 0;
        
        for (int i = 1; i <= n; i++) {
            if (N % i == 0) {
                plist[index++] = i;
                if (i != (int) (N / i)) {
                    plist[index++] = (int) (N / i);
                }
            }
        }
        
        int ans = 0;
        for (int i = 0; i < index; i++) {
            int x = plist[i];
            int kari = (N / x) - 1;
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