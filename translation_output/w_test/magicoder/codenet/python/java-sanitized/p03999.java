import java.util.Scanner;

public class p03999 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        int ans = 0;
        int len = s.length();
        for (int i = 0; i < Math.pow(2, len - 1); i++) {
            String pat = s.substring(0, 1);
            int index = 1;
            for (int j = 0; j < len - 1; j++) {
                if ((i >> j & 1) == 1) {
                    pat += "+";
                }
                pat += s.substring(index, index + 1);
                index += 1;
            }
            ans += Integer.parseInt(pat);
        }
        System.out.println(ans);
    }
}