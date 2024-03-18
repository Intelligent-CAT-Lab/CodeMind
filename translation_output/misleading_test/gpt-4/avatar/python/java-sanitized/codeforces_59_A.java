import java.util.Scanner;

public class codeforces_59_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String txt = scanner.nextLine();
        StringBuilder out = new StringBuilder(" ");
        int cap = 0;
        int small = 0;

        for (int i = 0; i < txt.length(); i++) {
            if (Character.isLowerCase(txt.charAt(i))) {
                small++;
            } else {
                cap++;
            }
        }

        if (small >= cap) {
            for (int i = 0; i < txt.length(); i++) {
                out.append(Character.toLowerCase(txt.charAt(i)));
            }
        } else {
            for (int i = 0; i < txt.length(); i++) {
                out.append(Character.toUpperCase(txt.charAt(i)));
            }
        }

        System.out.println(out.toString());
        scanner.close();
    }
}