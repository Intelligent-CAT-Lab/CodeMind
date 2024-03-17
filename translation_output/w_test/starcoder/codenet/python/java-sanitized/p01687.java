import java.util.*;
public class p01687 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String ans = "";
        int l = s.length();
        for(int i = 0; i < l; i++) {
            if(i <= l - 8 && s.substring(i, i + 8).equals("AADINNUY")) {
                ans += "AIZUNYAN";
                i += 8;
            } else {
                ans += s.charAt(i);
            }
        }
        System.out.println(ans);
    }
}