import java.util.*;

public class p03248 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        if (s.charAt(0) == '0' || s.charAt(s.length() - 1) == '1') {
            System.out.println(-1);
            return;
        }
        for (int i = 0; i < (s.length() - 1) / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - i - 2)) {
                System.out.println(-1);
                return;
            }
        }
        StringBuilder sd = new StringBuilder(s.substring(0, s.length() - 1));
        sd.append('1');
        List<Integer> plist = new ArrayList<>();
        for (int i = 0; i < sd.length(); i++) {
            if (sd.charAt(i) == '1') {
                plist.add(i);
            }
        }
        for (int i = 0; i < s.length() - 1; i++) {
            int r = Collections.binarySearch(plist, i);
            if (r < 0) {
                r = -r - 1;
            }
            System.out.println((i + 1) + " " + (plist.get(r) + 1));
        }
    }
}