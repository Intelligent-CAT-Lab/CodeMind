import java.util.*;
public class p01938 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int ans = 0;
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) < s.charAt(i+1)) {
                ans++;
            }
        }
        System.out.println(ans);
    }
}