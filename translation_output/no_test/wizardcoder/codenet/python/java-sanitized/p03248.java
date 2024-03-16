import java.util.Arrays;
import java.util.Scanner;

public class p03248 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        if (s.charAt(s.length() - 1) == '1' || s.charAt(0) == '0') {
            System.out.println(-1);
            return;
        }
        for (int i = 0; i < (s.length() - 1) / 2; i++) {
            if (s.charAt(i)!= s.charAt(s.length() - i - 2)) {
                System.out.println(-1);
                return;
            }
        }
        String sd = s.substring(0, s.length() - 1) + '1';
        int[] plist = new int[sd.length()];
        for (int i = 0; i < sd.length(); i++) {
            if (sd.charAt(i) == '1') {
                plist[i] = 1;
            }
        }
        for (int i = 0; i < s.length() - 1; i++) {
            int r = Arrays.binarySearch(plist, i);
            if (r < 0) {
                r = -r - 1;
            }
            System.out.println(i + 1 + " " + (r + 1));
        }
    }
}