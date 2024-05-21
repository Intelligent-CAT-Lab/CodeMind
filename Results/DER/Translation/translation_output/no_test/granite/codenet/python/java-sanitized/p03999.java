import java.util.Scanner;

public class p03999 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int ans = 0;
        for (int i = 0; i < Math.pow(2, s.length() - 1); i++) {
            String pat = s.charAt(0) + "";
            int index = 1;
            for (int j = 0; j < s.length() - 1; j++) {
                if ((i >> j) % 2 == 1) {
                    pat += "+";
                }
                pat += s.charAt(index);
                index++;
            }
            //System.out.println(pat);
            ans += eval(pat);
        }
        System.out.println(ans);
    }

    public static int eval(String s) {
        int ans = 0;
        int num = 0;
        char op = '+';
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '+' || s.charAt(i) == '-') {
                ans += num;
                num = 0;
                op = s.charAt(i);
            } else if (s.charAt(i) == '(') {
                int start = i;
                int end = s.indexOf(')', i);
                int sub = eval(s.substring(start + 1, end));
                if (op == '+') {
                    ans += sub;
                } else {
                    ans -= sub;
                }
                i = end;
            } else {
                num = num * 10 + s.charAt(i) - '0';
            }
        }
        ans += num;
        return ans;
    }
}