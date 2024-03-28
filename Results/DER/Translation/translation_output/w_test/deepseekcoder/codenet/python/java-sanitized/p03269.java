import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class p03269 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int l = scanner.nextInt();

        int d = (int) (Math.log(l) / Math.log(2));
        int n = d+1;
        int m = 2*d;
        List<String> ans = new ArrayList<>();

        for (int i = 1; i < n; i++) {
            ans.add(i + " " + (i+1) + " " + "0");
            ans.add(i + " " + (i+1) + " " + (1 << (i-1)));
        }

        while (l > (1 << d)) {
            for (int i = n-1; i > 0; i--) {
                if (l-(1 << (i-1)) > 1 << d-1) {
                    ans.add(i + " " + n + " " + (l-(1 << (i-1))));
                    m += 1;
                    l -= (1 << (i-1));
                    break;
                }
            }
        }

        System.out.println(n + " " + m);
        for (String a : ans) {
            System.out.println(a);
        }
    }
}