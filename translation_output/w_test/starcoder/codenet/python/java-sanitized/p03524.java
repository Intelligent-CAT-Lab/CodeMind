import java.util.*;
public class p03524 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int[] frq = new int[3];
        for (int i = 0; i < s.length(); i++) {
            frq[s.charAt(i) - 'a']++;
        }
        if (Math.abs(frq[0] - frq[1]) <= 1 && Math.abs(frq[1] - frq[2]) <= 1) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}