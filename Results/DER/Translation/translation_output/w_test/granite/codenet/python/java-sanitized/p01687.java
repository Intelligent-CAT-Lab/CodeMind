import java.util.Scanner;

public class p01687 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String ref = "AADINNUY";
        String aizu = "AIZUNYAN";
        String inp = scanner.nextLine();
        if (inp.length() < 8) {
            System.out.println(inp);
        } else {
            StringBuilder ans = new StringBuilder();
            int l = inp.length();
            int i = 0;
            while (i < l) {
                if (i <= l - 8 && isSorted(inp.substring(i, i + 8))) {
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

    private static boolean isSorted(String s) {
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length - 1; i++) {
            if (chars[i] > chars[i + 1]) {
                return false;
            }
        }
        return true;
    }
}