import java.util.*;
public class p03524 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int[] frq = new int[26];
        for (int i = 0; i < s.length(); i++) {
            frq[s.charAt(i) - 'a']++;
        }
        int max = 0, min = 100000000;
        for (int i = 0; i < 26; i++) {
            if (frq[i] > max) {
                max = frq[i];
            }
            if (frq[i] < min) {
                min = frq[i];
            }
        }
        if (max - min <= 1) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}