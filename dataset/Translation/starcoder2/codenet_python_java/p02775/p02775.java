import java.util.Scanner;

public class p02775 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int[] n = new int[s.length() + 1];
        for (int i = 0; i < s.length(); i++) {
            n[i] = s.charAt(s.length() - i - 1) - '0';
        }
        int s1 = 0;
        int res = 0;
        for (int i = 0; i < n.length - 1; i++) {
            int k = n[i] + s1;
            if (k < 5 || (k == 5 && n[i + 1] < 5)) {
                res += k;
                s1 = 0;
            } else {
                res += 10 - k;
                s1 = 1;
            }
        }
        res += s1;
        System.out.println(res);
    }
}