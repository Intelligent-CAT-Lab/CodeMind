import java.util.Arrays;
import java.util.Scanner;

public class p01687 {
    public static void main(String[] args) {
        char[] ref = {'A', 'A', 'D', 'I', 'N', 'N', 'U', 'Y'};
        String aizu = "AIZUNYAN";
        Scanner scanner = new Scanner(System.in);
        String inp = scanner.next();
        if (inp.length() < 8) {
            System.out.println(inp);
        } else {
            StringBuilder ans = new StringBuilder();
            int l = inp.length();
            int i = 0;
            while (i < l) {
                if (i <= l - 8 && isSameChars(inp.substring(i, i + 8).toCharArray(), ref)) {
                    ans.append(aizu);
                    i += 8;
                } else {
                    ans.append(inp.charAt(i));
                    i += 1;
                }
            }
            System.out.println(ans.toString());
        }
    }

    private static boolean isSameChars(char[] a, char[] b) {
        Arrays.sort(a);
        Arrays.sort(b);
        return Arrays.equals(a, b);
    }
}