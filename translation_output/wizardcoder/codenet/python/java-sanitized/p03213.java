import java.util.*;

public class p03213 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] cnt = new int[101];
        Arrays.fill(cnt, 1);
        for (int i = 2; i <= n; i++) {
            for (int j = 2; j <= n; j++) {
                while (i % j == 0) {
                    i /= j;
                    cnt[j]++;
                }
            }
        }

        int san = 0, go = 0, jugo = 0, nijugo = 0, shitigo = 0;
        for (int i = 2; i <= 100; i++) {
            if (cnt[i] >= 3) san++;
            if (cnt[i] >= 5) go++;
            if (cnt[i] >= 15) jugo++;
            if (cnt[i] >= 25) nijugo++;
            if (cnt[i] >= 75) shitigo++;
        }

        System.out.println(shitigo + nijugo*(san-1) + jugo*(go-1) + go*(go-1)//2*(san-2));
    }
}