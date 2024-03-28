import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class p03618 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        s = sortString(s);
        int[] g = groupString(s);
        int l = s.length();

        int res = l * (l - 1) / 2 + 1;
        for (int i = 0; i < g.length; i++) {
            int p = g[i];
            res -= p * (p - 1) / 2;
        }
        System.out.println(res);
    }

    private static String sortString(String s) {
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }

    private static int[] groupString(String s) {
        int[] g = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            g[i] = s.charAt(i) - 'a' + 1;
        }
        return g;
    }
}