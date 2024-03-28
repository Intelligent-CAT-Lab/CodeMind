import java.util.Scanner;

public class p03999 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int ans = 0;
        for (int i = 0; i < (1 << (s.length() - 1)); i++) {
            String pat = s.charAt(0) + "";
            int index = 1;
            for (int j = 0; j < s.length() - 1; j++) {
                if ((i & (1 << j))!= 0) {
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
        int res = 0;
        int num = 0;
        char sign = '+';
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isDigit(c)) {
                num = num * 10 + (c - '0');
            } else if (c == '+' || c == '-') {
                if (sign == '+') {
                    res += num;
                } else {
                    res -= num;
                }
                sign = c;
                num = 0;
            }
        }
        if (sign == '+') {
            res += num;
        } else {
            res -= num;
        }
        return res;
    }
}