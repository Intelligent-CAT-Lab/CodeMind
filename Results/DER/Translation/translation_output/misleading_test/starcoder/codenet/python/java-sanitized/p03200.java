import java.util.*;
public class p03200 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int cnt = 0;
        int l = 0;
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == 'W') {
                cnt += i - l;
                l += 1;
            }
        }
        System.out.println(cnt);
    }
}