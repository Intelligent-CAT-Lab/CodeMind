import java.util.Scanner;

public class p03999 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int ans = 0;
        for (int i = 1; i < (1 << (s.length() - 1)); i++) {
            String pat = s.charAt(0) + "";
            int index = 1;
            for (int j = 0; j < s.length() - 1; j++) {
                if ((i >> j) & 1 == 1) {
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

    public static int eval(String expression) {
        int result = 0;
        int i = 0;
        while (i < expression.length()) {
            if (expression.charAt(i) == '+') {
                result += eval(expression.substring(i + 1, i + 2));
            } else if (expression.charAt(i) == '-') {
                result -= eval(expression.substring(i + 1, i + 2));
            } else {
                result += Integer.parseInt(expression.substring(i, i));
            }
            i++;
        }
        return result;
    }
}