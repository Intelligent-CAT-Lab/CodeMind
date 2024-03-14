import java.util.*;
public class p02910 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String[] odd = {"R", "U", "D"};
        String[] even = {"L", "U", "D"};
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'R' || s.charAt(i) == 'U' || s.charAt(i) == 'D') {
                if (i % 2 == 0) {
                    if (s.charAt(i)!= 'L') {
                        System.out.println("No");
                        return;
                    }
                } else {
                    if (s.charAt(i)!= 'R') {
                        System.out.println("No");
                        return;
                    }
                }
            }
        }
        System.out.println("Yes");
    }
}