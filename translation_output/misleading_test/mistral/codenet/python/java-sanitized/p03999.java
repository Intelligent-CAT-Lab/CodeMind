import java.util.Scanner;

public class p03999 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int ans = 0;
        for (int i = 1; i < Math.pow(2, s - 1); i++) {
            String pat = "";
            int index = 1;
            for (int j = 0; j < s - 1; j++) {
                if ((i >> j) & 1 == 1) {
                    pat += "+";
                }
                pat += s;
                index++;
            }
            //System.out.println(pat);
            ans += eval(pat);
        }
        System.out.println(ans);
    }

    public static int eval(String s) {
        int ans = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '+') {
                ans++;
            } else {
                ans--;
            }
        }
        return ans;
    }
}