import java.util.Scanner;

public class p03269 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int l = scanner.nextInt();

        int d = 0;
        while (2 * (1 << d) <= l) {
            d++;
        }
        int n = d + 1;
        int m = 2 * d;
        StringBuilder ans = new StringBuilder();
        for (int i = 1; i < n; i++) {
            ans.append(i).append(" ").append(i + 1).append(" 0\n");
            ans.append(i).append(" ").append(i + 1).append(" ").append(1 << (i - 1)).append("\n");
        }

        while (l > (1 << d)) {
            for (int i = n - 1; i > 0; i--) {
                if (l - (1 << (i - 1)) > (1 << (d - 1))) {
                    ans.append(i).append(" ").append(n).append(" ").append(l - (1 << (i - 1))).append("\n");
                    m++;
                    l -= (1 << (i - 1));
                    break;
                }
            }
        }

        System.out.println(n + " " + m);
        System.out.println(ans.toString());
    }
}