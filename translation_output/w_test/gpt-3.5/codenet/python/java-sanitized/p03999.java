import java.util.Scanner;

public class p03999 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        int ans = 0;
        for (int i = 0; i < Math.pow(2, s.length() - 1); i++) {
            String pat = String.valueOf(s.charAt(0));
            int index = 1;
            for (int j = 0; j < s.length() - 1; j++) {
                if ((i >> j & 1) == 1) {
                    pat += "+";
                }
                pat += s.charAt(index);
                index++;
            }
            ans += evaluate(pat);
        }
        System.out.println(ans);
    }

    public static int evaluate(String expression) {
        String[] tokens = expression.split("\\+");
        int sum = 0;
        for (String token : tokens) {
            sum += Integer.parseInt(token);
        }
        return sum;
    }
}