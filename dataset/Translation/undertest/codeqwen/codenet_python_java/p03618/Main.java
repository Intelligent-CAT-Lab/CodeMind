import java.util.*;

public class p03618 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        String sortedString = new String(chars);
        int l = sortedString.length();

        int res = l * (l - 1) / 2 + 1;
        for (int i = 0; i < l; i++) {
            int p = 1;
            while (i + 1 < l && sortedString.charAt(i) == sortedString.charAt(i + 1)) {
                i++;
                p++;
            }
            res -= p * (p - 1) / 2;
        }
        System.out.println(res);
    }
}