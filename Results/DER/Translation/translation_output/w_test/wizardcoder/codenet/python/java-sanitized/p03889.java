import java.util.Scanner;

public class p03889 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char[] t = s.toCharArray();
        for (int i = 0; i < t.length; i++) {
            if (t[i] == 'p') {
                t[i] = 'q';
            } else if (t[i] == 'q') {
                t[i] = 'p';
            }
            if (t[i] == 'b') {
                t[i] = 'd';
            } else if (t[i] == 'd') {
                t[i] = 'b';
            }
        }
        String ans = new String(t);
        if (s.equals(ans)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}