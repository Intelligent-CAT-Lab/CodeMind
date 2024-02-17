import java.util.*;
import java.util.ArrayList;

public class codforce {
    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        int n = str.nextInt();
        String s = " ";
        
        while (n > 0) {
            int x = n % 2;
            n /= 2;
            s += x + " ";
        }
        
        int ans = 0;
        
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                ans++;
            }
        }
        
        System.out.println(ans);
    }
}