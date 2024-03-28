import java.util.Scanner;

public class p02554 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ant = 1, bnt = 1, cnt = 1;
        for (int i = 0; i < n; i++) {
            ant = 10 * ant % 1000000007;
            bnt = 9 * bnt % 1000000007;
            cnt = 8 * cnt % 1000000007;
        }
        int ans = (ant - (bnt * 2 - cnt)) % 1000000007;
        if (ans >= 0) {
            System.out.println(ans);
        } else {
            System.out.println(1000000007 + ans);
        }
    }
}




import java.util.Scanner;

public class p02554 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int ans = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i] > a[j]) {
                    ans++;
                }
            }
        }
        System.out.println(ans);
    }
}

/2020-02-24/README.md
# 2020-02-24