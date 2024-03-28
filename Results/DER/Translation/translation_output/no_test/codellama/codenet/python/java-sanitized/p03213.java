import java.util.Scanner;

public class p03213 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] cnt = new int[101];
        for (int i = 2; i <= n; i++) {
            for (int j = 2; j <= n; j++) {
                while (i % j == 0) {
                    i /= j;
                    cnt[j]++;
                }
            }
        }

        int san = 0;
        int go = 0;
        int jugo = 0;
        int nijugo = 0;
        int shitigo = 0;
        for (int i = 2; i <= 100; i++) {
            if (cnt[i] >= 3) {
                san++;
            }
            if (cnt[i] >= 5) {
                go++;
            }
            if (cnt[i] >= 15) {
                jugo++;
            }
            if (cnt[i] >= 25) {
                nijugo++;
            }
            if (cnt[i] >= 75) {
                shitigo++;
            }
        }

        System.out.println(shitigo + nijugo * (san - 1) + jugo * (go - 1) + go * (go - 1) / 2 * (san - 2));
    }
}