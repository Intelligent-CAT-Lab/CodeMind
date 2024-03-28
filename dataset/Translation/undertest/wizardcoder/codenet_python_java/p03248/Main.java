import java.util.Arrays;
import java.util.Scanner;

public class p03248 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        if (s.charAt(0) == '0' || s.charAt(s.length() - 1) == '1') {
            System.out.println(-1);
            return;
        }
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i)!= s.charAt(s.length() - 1 - i)) {
                System.out.println(-1);
                return;
            }
        }
        char[] sd = s.toCharArray();
        sd[sd.length - 1] = '1';
        int[] plist = new int[sd.length];
        for (int i = 0; i < sd.length; i++) {
            if (sd[i] == '1') {
                plist[i] = 1;
            }
        }
        for (int i = 0; i < s.length() - 1; i++) {
            int r = Arrays.binarySearch(plist, 0, plist.length, i);
            if (r < 0) {
                r = -r - 1;
            }
            System.out.println(i + 1 + " " + (r + 1));
        }
    }
}