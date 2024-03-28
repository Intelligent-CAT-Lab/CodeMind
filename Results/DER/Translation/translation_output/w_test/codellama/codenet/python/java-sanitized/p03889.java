import java.util.Scanner;

public class p03889 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String t = new StringBuilder(s).reverse().toString();
        for (int i = 0; i < t.length(); i++) {
            if (t.charAt(i) == 'p') {
                t = t.substring(0, i) + 'q' + t.substring(i + 1);
            } else if (t.charAt(i) == 'q') {
                t = t.substring(0, i) + 'p' + t.substring(i + 1);
            } else if (t.charAt(i) == 'b') {
                t = t.substring(0, i) + 'd' + t.substring(i + 1);
            } else if (t.charAt(i) == 'd') {
                t = t.substring(0, i) + 'b' + t.substring(i + 1);
            }
        }
        if (s.equals(t)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}