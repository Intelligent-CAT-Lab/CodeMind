import java.util.Scanner;

public class p03889 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String t = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);
            if (c == 'p') {
                c = 'q';
            } else if (c == 'q') {
                c = 'p';
            } else if (c == 'b') {
                c = 'd';
            } else if (c == 'd') {
                c = 'b';
            }
            t += c;
        }
        String ans = "Yes";
        if (!s.equals(t)) {
            ans = "No";
        }
        System.out.println(ans);
    }
}