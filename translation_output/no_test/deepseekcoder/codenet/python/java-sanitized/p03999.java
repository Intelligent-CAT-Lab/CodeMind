import java.util.Scanner;

public class p03999 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        int ans = 0;
        int len = s.length();
        for (int i = 0; i < Math.pow(2, len - 1); i++) {
            StringBuilder pat = new StringBuilder(String.valueOf(s.charAt(0)));
            int index = 1;
            for (int j = 0; j < len - 1; j++) {
                if ((i >> j & 1) == 1) {
                    pat.append("+");
                }
                pat.append(s.charAt(index));
                index += 1;
            }
            ans += calculate(pat.toString());
        }
        System.out.println(ans);
    }

    private static int calculate(String pat) {
        String[] split = pat.split("\\+");
        int sum = 0;
        for (String s : split) {
            sum += Integer.parseInt(s);
        }
        return sum;
    }
}