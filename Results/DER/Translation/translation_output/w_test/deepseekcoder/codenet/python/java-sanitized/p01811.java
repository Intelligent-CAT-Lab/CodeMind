import java.util.Scanner;

public class p01811 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String moto = scanner.next();
        String s = moto;
        String gene = "ABC";
        boolean f = true;
        StringBuilder log = new StringBuilder();
        while (s.length() > 3 && f) {
            f = false;
            if (s.substring(0, 3).equals("ABC")) {
                s = s.replaceFirst("ABC", "A");
                log.append('A');
                f = true;
            } else if (s.substring(s.length() - 3).equals("ABC")) {
                s = s.replaceFirst("ABC", "C");
                log.append('C');
                f = true;
            } else if (s.contains("ABC")) {
                s = s.replaceFirst("ABC", "B");
                log.append('B');
                f = true;
            }
        }
        if (!s.equals(gene)) {
            System.out.println("No");
            System.exit(0);
        }
        int l = log.length();
        for (int i = 0; i < l; i++) {
            s = s.replace(String.valueOf(log.charAt(l - 1 - i)), "ABC");
        }
        if (s.equals(moto)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}