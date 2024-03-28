import java.util.*;

public class p01687 {
    public static void main(String[] args) {
        String ref = "AADINNUY";
        String aizu = "AIZUNYAN";
        Scanner sc = new Scanner(System.in);
        String inp = sc.nextLine();
        if (inp.length() < 8) {
            System.out.println(inp);
        } else {
            String ans = "";
            int l = inp.length();
            int i = 0;
            while (i < l) {
                if (i <= l - 8 && inp.substring(i, i + 8).equals(ref)) {
                    ans += aizu;
                    i += 8;
                } else {
                    ans += inp.charAt(i);
                    i++;
                }
            }
            System.out.println(ans);
        }
    }
}