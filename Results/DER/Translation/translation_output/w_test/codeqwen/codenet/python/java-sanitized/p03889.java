import java.util.Scanner;

public class p03889 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        StringBuilder t = new StringBuilder(s).reverse();
        for (int i = 0; i < t.length(); i++) {
            char c = t.charAt(i);
            if (c == 'p') {
                t.setCharAt(i, 'q');
            } else if (c == 'q') {
                t.setCharAt(i, 'p');
            } else if (c == 'b') {
                t.setCharAt(i, 'd');
            } else if (c == 'd') {
                t.setCharAt(i, 'b');
            }
        }
        String ans = s.equals(t.toString()) ? "Yes" : "No";
        System.out.println(ans);
    }
}