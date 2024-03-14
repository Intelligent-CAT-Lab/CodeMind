import java.util.*;
public class p01938 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        int ans = 0;
        for(int i = 0; i < S.length(); i++) {
            int now = S.charAt(i) - 'A';
            int next = S.charAt(i+1) - 'A';
            if(now < next) {
                ans += 1;
            }
        }
        System.out.println(ans);
    }
}