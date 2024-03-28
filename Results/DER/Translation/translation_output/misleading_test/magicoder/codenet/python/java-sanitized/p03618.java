import java.util.*;

public class p03618 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        s = new String(chars);
        int l = s.length();
        int res = l * (l - 1) / 2 + 1;
        int count = 1;
        for (int i = 1; i < l; i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                count++;
            } else {
                res -= count * (count - 1) / 2;
                count = 1;
            }
        }
        res -= count * (count - 1) / 2;
        System.out.println(res);
    }
}