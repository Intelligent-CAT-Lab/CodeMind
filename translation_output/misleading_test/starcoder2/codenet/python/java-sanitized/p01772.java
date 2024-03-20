import java.util.*;
public class p01772 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String ans = "";
        boolean flag = false;
        for (char c : s.toCharArray()) {
            if (c == 'A' && !flag) flag = true;
            if (c == 'Z' && flag) {
                ans += "AZ";
                flag = false;
            }
        }
        if (ans.equals("")) System.out.println(-1);
        else System.out.println(ans);
    }
}