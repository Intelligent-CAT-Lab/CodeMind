import java.util.Scanner;

public class p03889 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        StringBuilder t = new StringBuilder(s);
        t.reverse();
        for (int i = 0; i < t.length(); i++) {
            if (t.charAt(i) == 'p') {
                t.setCharAt(i, 'q');
            } else if (t.charAt(i) == 'q') {
                t.setCharAt(i, 'p');
            }
            if (t.charAt(i) == 'b') {
                t.setCharAt(i, 'd');
            } else if (t.charAt(i) == 'd') {
                t.setCharAt(i, 'b');
            }
        }
        String ans = s.equals(t.toString()) ? "Yes" : "No";
        System.out.println(ans);
    }
}