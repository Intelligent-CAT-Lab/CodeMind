import java.util.Scanner;

public class p03999 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int ans = 0;
        for (int i = 0; i < (1 << (s.length() - 1)); i++) {
            String pat = s.charAt(0) + "";
            int index = 1;
            for (int j = 0; j < s.length() - 1; j++) {
                if ((i >> j) % 2 == 1) {
                    pat += "+";
                }
                pat += s.charAt(index);
                index += 1;
            }
            //System.out.println(pat);
            ans += Integer.parseInt(pat);
        }
        System.out.println(ans);
    }
}