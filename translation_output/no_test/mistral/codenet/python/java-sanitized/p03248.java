import java.util.*;

public class p03248 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        if (s.charAt(s.length() - 1) == '1' || s.charAt(0) == '0') {
            System.out.println(-1);
            return;
        }
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) != s.charAt(s.length() - i - 2)) {
                System.out.println(-1);
                return;
            }
        }
        String sd = s.substring(0, s.length() - 1) + "1";
        List<Integer> plist = new ArrayList<>();
        for (int i = 0; i < sd.length(); i++) {
            if (sd.charAt(i) == '1') {
                plist.add(i);
            }
        }
        for (int i = 0; i < s.length() - 1; i++) {
            int r = bisect.bisect(plist, i);
            System.out.println(i + 1, plist.get(r) + 1);
        }
    }
}