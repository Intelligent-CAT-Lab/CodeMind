import java.util.*;
public class p03569 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int i = 0, j = s.length() - 1, c = 0;
        while(true) {
            if (i >= j) break;
            if (s.charAt(i) == s.charAt(j)) {
                i++;
                j--;
            } else {
                if (s.charAt(i) == 'x') {
                    i++;
                    c++;
                } else if (s.charAt(j) == 'x') {
                    j--;
                    c++;
                } else {
                    System.out.println("-1");
                    return;
                }
            }
        }
        System.out.println(c);
    }
}