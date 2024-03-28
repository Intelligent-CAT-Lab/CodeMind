```java
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        int l = s.length();
        Map<String, Integer> fm = new HashMap<>();

        fm.put("", -1);

        System.out.println(main(s, fm, l));
    }

    public static int main(String s, Map<String, Integer> fm, int l) {
        if (fm.containsKey(s)) {
            return fm.get(s);
        }
        int r = -1;
        if (l > 5 && s.charAt(1) == '(' && s.charAt(l-1) == ')') {
            if (s.charAt(0) == 'R' || s.charAt(0) == '?') {
                for (int i = 3; i < l-2; i++) {
                    if (s.charAt(i) != ',' && s.charAt(i) != '?') {
                        continue;
                    }
                    int tl = main(s.substring(2, i), fm, i - 2);
                    int tr = main(s.substring(i+1, l-1), fm, l - i - 2);
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
                    int tl = main(s.substring(2, i), fm, i - 2);
                    int tr = main(s.substring(i+1, l-1), fm, l - i - 2);
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
        for (char tc : new char[]{'R', 'L', ',', '(', ')'}) {
            if (s.indexOf(tc) >= 0) {
                ff = false;
                break;
            }
        }
        if (ff) {
            r = Integer.parseInt(s.replaceAll("\\?", "9"));
        }
        fm.put(s, r);
        return r;
    }
}
```

