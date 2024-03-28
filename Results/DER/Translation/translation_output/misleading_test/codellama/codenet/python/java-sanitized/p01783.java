import java.util.Scanner;

public class p01783 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int l = s.length();
        int r = -1;
        if (l > 5 && s.charAt(1) == '(' && s.charAt(l-1) == ')') {
            if (s.charAt(0) == 'R') {
                for (int i = 3; i < l-2; i++) {
                    if (s.charAt(i) != ',' && s.charAt(i) != '?') {
                        continue;
                    }
                    int tl = f(s.substring(2, i));
                    int tr = f(s.substring(i+1, l-1));
                    if (tl >= 0 && tr >= 0 && r < tr) {
                        r = tr;
                    }
                }
            }
            if (s.charAt(0) == 'L') {
                for (int i = 3; i < l-2; i++) {
                    if (s.charAt(i) != ',' && s.charAt(i) != '?') {
                        continue;
                    }
                    int tl = f(s.substring(2, i));
                    int tr = f(s.substring(i+1, l-1));
                    if (tl >= 0 && tr >= 0 && r < tl) {
                        r = tl;
                    }
                }
            }
        }
        boolean ff = true;
        if (s.charAt(0) == '0' && l > 1) {
            ff = false;
        }
        for (char tc : "RL,()".toCharArray()) {
            if (s.contains(String.valueOf(tc))) {
                ff = false;
                break;
            }
        }
        if (ff) {
            r = Integer.parseInt(s.replace("?", "9"));
        }
        if (r < 0) {
            System.out.println("invalid");
        } else {
            System.out.println(r);
        }
    }

    private static int f(String s) {
        int l = s.length();
        int r = -1;
        if (l > 5 && s.charAt(1) == '(' && s.charAt(l-1) == ')') {
            if (s.charAt(0) == 'R') {
                for (int i = 3; i < l-2; i++) {
                    if (s.charAt(i) != ',' && s.charAt(i) != '?') {
                        continue;
                    }
                    int tl = f(s.substring(2, i));
                    int tr = f(s.substring(i+1, l-1));
                    if (tl >= 0 && tr >= 0 && r < tr) {
                        r = tr;
                    }
                }
            }
            if (s.charAt(0) == 'L') {
                for (int i = 3; i < l-2; i++) {
                    if (s.charAt(i) != ',' && s.charAt(i) != '?') {
                        continue;
                    }
                    int tl = f(s.substring(2, i));
                    int tr = f(s.substring(i+1, l-1));
                    if (tl >= 0 && tr >= 0 && r < tl) {
                        r = tl;
                    }
                }
            }
        }
        boolean ff = true;
        if (s.charAt(0) == '0' && l > 1) {
            ff = false;
        }
        for (char tc : "RL,()".toCharArray()) {
            if (s.contains(String.valueOf(tc))) {
                ff = false;
                break;
            }
        }
        if (ff) {
            r = Integer.parseInt(s.replace("?", "9"));
        }
        return r;
    }
}