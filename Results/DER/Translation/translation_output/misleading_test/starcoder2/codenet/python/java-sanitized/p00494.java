import java.util.Scanner;

public class p00494 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int len = s.length();
        int i = 0, ans = 0;
        while (i < len) {
            int lenj = 0, leno = 0, leni = 0;
            while (i < len && s.charAt(i) == 'J') {
                lenj++;
                i++;
            }
            while (i < len && s.charAt(i) == 'O') {
                leno++;
                i++;
            }
            while (i < len && s.charAt(i) == 'I') {
                leni++;
                i++;
            }
            if (lenj >= leno && leni >= leno) {
                ans = Math.max(ans, leno);
            }
        }
        System.out.println(ans);
    }
}