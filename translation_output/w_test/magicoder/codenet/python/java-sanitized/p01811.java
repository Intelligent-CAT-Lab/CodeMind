import java.util.Scanner;

public class p01811 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String moto = scanner.nextLine();
        String s = moto;
        String gene = "ABC";
        boolean f = true;
        String log = "";
        while (s.length() > 3 && f) {
            f = false;
            if (s.substring(0, 3).equals("ABC")) {
                s = s.replace("ABC", "A");
                log += "A";
                f = true;
            } else if (s.substring(s.length() - 3).equals("ABC")) {
                s = s.replace("ABC", "C");
                log += "C";
                f = true;
            } else if (s.contains("ABC")) {
                s = s.replace("ABC", "B");
                log += "B";
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