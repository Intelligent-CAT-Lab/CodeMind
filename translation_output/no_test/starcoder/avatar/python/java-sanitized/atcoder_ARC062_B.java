import java.util.*;
public class atcoder_ARC062_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int g = 0, p = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'g') g++;
            else p++;
        }
        System.out.println((g - p) / 2);
    }
}