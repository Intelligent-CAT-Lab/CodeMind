import java.util.Scanner;

public class p01811 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String moto = scanner.nextLine();
        String s = moto;
        String gene = "ABC";
        boolean f = true;
        String[] log = new String[moto.length()];
        int i = 0;
        while (s.length() > 3 && f) {
            f = false;
            if (s.substring(0, 3).equals("ABC")) {
                s = s.replaceFirst("ABC", "A");
                log[i++] = "A";
                f = true;
            } else if (s.substring(s.length() - 3).equals("ABC")) {
                s = s.replaceFirst("ABC", "C");
                log[i++] = "C";
                f = true;
            } else if (s.contains("ABC")) {
                s = s.replaceFirst("ABC", "B");
                log[i++] = "B";
                f = true;
            }
        }
        if (!s.equals(gene)) {
            System.out.println("No");
            return;
        }
        for (int j = 0; j < log.length; j++) {
            s = s.replaceFirst(log[log.length - 1 - j], "ABC");
        }
        if (s.equals(moto)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}