import java.util.Scanner;

public class p01811 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String moto = scanner.nextLine();
        String s = moto;
        String gene = "ABC";
        boolean f = true;
        String[] log = new String[moto.length()];
        int logIndex = 0;

        while (s.length() > 3 && f) {
            f = false;
            if (s.startsWith("ABC")) {
                s = s.replace("ABC", "A");
                log[logIndex] = "A";
                f = true;
            } else if (s.endsWith("ABC")) {
                s = s.replace("ABC", "C");
                log[logIndex] = "C";
                f = true;
            } else if (s.contains("ABC")) {
                s = s.replace("ABC", "B");
                log[logIndex] = "B";
                f = true;
            }
        }

        if (!s.equals(gene)) {
            System.out.println("No");
            System.exit(0);
        }

        int l = log.length;
        for (int i = 0; i < l; i++) {
            s = s.replace(log[l - 1 - i], "ABC");
        }

        if (s.equals(moto)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}