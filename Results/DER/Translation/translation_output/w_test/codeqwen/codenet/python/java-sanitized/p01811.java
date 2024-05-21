import java.util.Scanner;

public class p01811 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String moto = scanner.nextLine();
        String s = moto;
        String gene = "ABC";
        boolean f = true;
        StringBuilder log = new StringBuilder();
        while (s.length() > 3 && f) {
            f = false;
            if (s.substring(0, 3).equals("ABC")) {
                s = s.replace("ABC", "A");
                log.append("A");
                f = true;
            } else if (s.substring(s.length() - 3).equals("ABC")) {
                s = s.replace("ABC", "C");
                log.append("C");
                f = true;
            } else if (s.contains("ABC")) {
                s = s.replace("ABC", "B");
                log.append("B");
                f = true;
            }
        }
        if (!s.equals(gene)) {
            System.out.println("No");
            return;
        }
        String logString = log.toString();
        for (int i = 0; i < logString.length(); i++) {
            s = s.replace(logString.charAt(logString.length() - 1 - i), 'A');
        }
        if (!s.equals(moto)) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
        }
    }
}