import java.util.Arrays;
import java.util.Scanner;

public class p01687 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inp = scanner.nextLine();
        String aizu = "AIZUNYAN";
        char[] ref = {'A', 'A', 'D', 'I', 'N', 'N', 'U', 'Y'};
        if (inp.length() < 8) {
            System.out.println(inp);
        } else {
            StringBuilder ans = new StringBuilder();
            int l = inp.length();
            int i = 0;
            while (i < l) {
                if (i <= l - 8 && Arrays.equals(Arrays.copyOfRange(inp.toCharArray(), i, i + 8), ref)) {
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
}