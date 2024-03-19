import java.util.Scanner;

public class p00345 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        String all = "";
        String sub = "";
        int p = -1;

        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == '.') {
                int o = i;
            } else if (S.charAt(i) == '(') {
                p = i;
                sub = all;
            } else {
                all += S.charAt(i);
            }
        }

        int d = S.length() - o - 1;
        int l = p - o - 1;
        if (p == -1) {
            System.out.println(all + "/" + Math.pow(10, d));
        } else {
            d -= 2; // for ()
            System.out.println(Integer.parseInt(all) - Integer.parseInt(sub) + "/" + Math.pow(10, d) - Math.pow(10, l));
        }
    }
}