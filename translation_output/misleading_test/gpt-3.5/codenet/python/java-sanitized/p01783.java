import java.util.*;

class Main {
    static HashMap<String, Integer> fm;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        fm = new HashMap<>();
        fm.put("", -1);
        int result = findResult(s);
        if (result < 0) {
            System.out.println("invalid");
        } else {
            System.out.println(result);
        }
    }

    public static int findResult(String s) {
        if (fm.containsKey(s)) {
            return fm.get(s);
        }

        int l = s.length();
        int r = -1;

        if (l > 5 && s.charAt(1) == '(' && s.charAt(l-1) == ')') {
            if (s.charAt(0) == 'R' || s.charAt(0) == '?') {
                for (int i = 3; i < l-2; i++) {
                    if (s.charAt(i) != ',' && s.charAt(i) != '?') {
                        continue;
                    }
                    int tl = findResult(s.substring(2, i));
                    int tr = findResult(s.substring(i+1, l-1));
                    if (tl >= 0 && tr >= 0 && r < tr) {
                        r = tr;
                    }
                }
            }
            if (s.charAt(0) == 'L' || s.charAt(0) == '?') {
                for (int i = 3; i < l-2; i++) {
                    if (s.charAt(i) != ',' && s.charAt(i) != '?') {
                        continue;
                    }
                    int tl = findResult(s.substring(2, i));
                    int tr = findResult(s.substring(i+1, l-1));
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
        String specialChars = "RL,()";
        for (char tc : specialChars.toCharArray()) {
            if (s.indexOf(tc) != -1) {
                ff = false;
                break;
            }
        }
        if (ff) {
            r = Integer.parseInt(s.replace('?', '9'));
        }
        fm.put(s, r);
        return r;
    }
}