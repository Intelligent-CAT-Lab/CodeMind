import java.util.*;
public class p04012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char[] ch = s.toCharArray();
        int[] count = new int[26];
        for (int i = 0; i < ch.length; i++) {
            count[ch[i] - 'a']++;
        }
        for (int i = 0; i < 26; i++) {
            if (count[i] % 2 == 1) {
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
    }
}