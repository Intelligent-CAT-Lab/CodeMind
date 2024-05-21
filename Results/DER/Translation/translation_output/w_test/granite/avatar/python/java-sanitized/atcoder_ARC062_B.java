import java.util.*;

public class atcoder_ARC062_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int gCount = 0;
        int pCount = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'g') {
                gCount++;
            } else if (s.charAt(i) == 'p') {
                pCount++;
            }
        }
        System.out.println((gCount - pCount) / 2);
    }
}