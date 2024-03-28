import java.util.*;

public class p01687 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inp = sc.nextLine();
        String ref = "AADINNUY";
        String aizu = "AIZUNYAN";
        if (inp.length() < 8) {
            System.out.println(inp);
        } else {
            String ans = "";
            int l = inp.length();
            int i = 0;
            while (i < l) {
                if (i <= l - 8 && Arrays.equals(inp.substring(i, i + 8).toCharArray(), ref.toCharArray())) {
                    ans += aizu;
                    i += 8;
                } else {
                    ans += inp.charAt(i);
                    i += 1;
                }
            }
            System.out.println(ans);
        }
    }
}