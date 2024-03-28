import java.util.*;
import java.io.*;

public class p03269 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int d = 0;
        for (int i = 30; i >= 0; i--) {
            if (Math.pow(2, i) <= l) {
                d = i;
                break;
            }
        }
        int n = d + 1;
        int m = 2 * d;
        List<Integer> ans = new ArrayList<>();
        for (int i = 1; i < n; i++) {
            ans.add(i);
            ans.add(i + 1);
            ans.add(0);
            ans.add(i);
            ans.add(i + 1);
            ans.add(2 << (i - 1));
        }
        while (l > Math.pow(2, d)) {
            for (int i = n - 1; i >= 0; i--) {
                if (l - Math.pow(2, i - 1) > Math.pow(2, d) - 1) {
                    ans.add(i);
                    ans.add(n);
                    ans.add(l - Math.pow(2, i - 1));
                    m += 1;
                    l -= Math.pow(2, i - 1);
                    break;
                }
            }
        }
        System.out.println(n + " " + m);
        for (int i = 0; i < ans.size(); i++) {
            if (i % 6 == 5) {
                System.out.println(ans.get(i));
            } else {
                System.out.print(ans.get(i) + " ");
            }
        }
    }
}