import java.util.Scanner;

public class codeforces_59_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String txt = scanner.nextLine();
        String out = "";
        int cap = 0;
        int small = 0;

        for (char t : txt.toCharArray()) {
            if (Character.isLowerCase(t)) {
                small++;
            } else {
                cap++;
            }
        }

        if (small >= cap) {
            for (char t : txt.toCharArray()) {
                out += Character.toLowerCase(t);
            }
        } else {
            for (char t : txt.toCharArray()) {
                out += Character.toUpperCase(t);
            }
        }

        System.out.println(out);
    }
}