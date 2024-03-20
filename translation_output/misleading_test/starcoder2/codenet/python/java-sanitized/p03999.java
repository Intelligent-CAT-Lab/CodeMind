import java.util.Scanner;

public class p03999 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int ans = 0;
        for (int i = 0; i < (1 << (s.length() - 1)); i++) {
            String pat = s.substring(0, 1);
            int index = 1;
            for (int j = 0; j < s.length() - 1; j++) {
                if ((i >> j & 1) == 1) {
                    pat += "+";
                }
                pat += s.substring(index, index + 1);
                index++;
            }
            //System.out.println(pat);
            ans += eval(pat);
        }
        System.out.println(ans);
    }

    public static int eval(String pat) {
        int ans = 0;
        int index = 0;
        int num = 0;
        while (index < pat.length()) {
            if (pat.charAt(index) >= '0' && pat.charAt(index) <= '9') {
                num = num * 10 + pat.charAt(index) - '0';
            } else {
                ans += num;
                num = 0;
                if (pat.charAt(index) == '+') {
                    ans += num;
                    num = 0;
                }
            }
            index++;
        }
        ans += num;
        return ans;
    }
}