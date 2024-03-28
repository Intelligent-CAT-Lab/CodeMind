import java.util.Scanner;

public class p01610 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.next();
        String[] s = {"..rr....", "..rr....","ggyybbww","ggyybbww","..oo....","..oo...."};
        for (int i = 0; i < a.length(); i++) {
            s = rotate(s, String.valueOf(a.charAt(i)));
        }

        for (String str : s) {
            System.out.println(str);
        }
    }

    public static String[] rotate(String[] s, String k) {
        String[] s_ = new String[6];
        if (k.equals("R")) {
            // Rotation logic for R
        } else if (k.equals("L")) {
            // Rotation logic for L
        } else if (k.equals("U")) {
            // Rotation logic for U
        } else if (k.equals("D")) {
            // Rotation logic for D
        } else if (k.equals("F")) {
            // Rotation logic for F
        } else {
            // Rotation logic for other
        }
        return s_;
    }
}