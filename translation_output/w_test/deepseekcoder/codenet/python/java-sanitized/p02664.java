import java.util.Scanner;

public class p02664 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        char[] a = input.toCharArray();

        for (int i = 0; i < a.length; i++) {
            if (a[i] == '?') {
                a[i] = 'D';
            }
        }

        StringBuilder b = new StringBuilder();
        for (int i = 0; i < a.length; i++) {
            b.append(a[i]);
        }

        System.out.println(b.toString());
    }
}