import java.util.Scanner;

public class p02987 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.next();
        String b = scanner.next();
        String c = scanner.next();
        String d = scanner.next();
        int flag = 0;
        if (a.equals(b) && c.equals(d)) {
            flag = 1;
        } else if (a.equals(c) && b.equals(d)) {
            flag = 1;
        } else if (a.equals(d) && b.equals(c)) {
            flag = 1;
        } else {
            flag = 0;
        }
        if (a.equals(b) && a.equals(c) && a.equals(d)) {
            flag = 0;
        }
        if (flag == 1) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}