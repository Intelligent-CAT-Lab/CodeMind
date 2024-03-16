import java.util.*;

public class p03362 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] p = new int[2000];
        int cnt = 0;
        for (int i = 2; i < 2000; i++) {
            if (p[i] == 0) {
                p[i] = i;
                cnt++;
                if (cnt == n) break;
                for (int j = i; j < 2000; j += i) {
                    p[j] = i;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(p[i] + " ");
        }
    }
}