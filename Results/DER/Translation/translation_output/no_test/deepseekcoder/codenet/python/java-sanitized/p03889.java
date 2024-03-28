import java.util.Scanner;

public class p03889 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        String t = new StringBuilder(s).reverse().toString();
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < t.length(); i++) {
            char c = t.charAt(i);
            if (c == 'p') {
                result.append('q');
            } else if (c == 'q') {
                result.append('p');
            } else if (c == 'b') {
                result.append('d');
            } else if (c == 'd') {
                result.append('b');
            } else {
                result.append(c);
            }
        }
        String ans = s.equals(result.toString()) ? "Yes" : "No";
        System.out.println(ans);
    }
}