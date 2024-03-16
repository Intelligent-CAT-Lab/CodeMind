import java.util.Arrays;
import java.util.Scanner;

public class p01687 {
    public static void main(String[] args) {
        char[] ref = {'A', 'D', 'I', 'N', 'U', 'Y'};
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
                if (i <= l - 8 && isSorted(inp.substring(i, i + 8).toCharArray(), ref)) {
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

    private static boolean isSorted(char[] chars, char[] ref) {
        char[] temp = chars.clone();
        Arrays.sort(temp);
        return Arrays.equals(temp, ref);
    }
}