import java.util.Scanner;

public class p00494 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int l = input.length();
        int i = 0;
        int ans = 0;
        while (i < l) {
            int lenj = 0;
            int leno = 0;
            int leni = 0;
            while (i < l && input.charAt(i) == 'J') {
                lenj++;
                i++;
            }
            while (i < l && input.charAt(i) == 'O') {
                leno++;
                i++;
            }
            while (i < l && input.charAt(i) == 'I') {
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