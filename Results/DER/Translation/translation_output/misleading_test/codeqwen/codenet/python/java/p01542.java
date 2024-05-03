Here is the Java version of your Python code:

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(main());
    }

    public static String main() {
        List<Integer> rr = new ArrayList<>();

        int f(String s) {
            char[] ca = {'0', '1', '+', '-', '*', '(', ')'};
            String[] sa = s.split("\\.");
            int r = -1;
            int sl = sa.length;

            Map<String, Integer> fm = new HashMap<>();

            int _f(String s) {
                if (fm.containsKey(s)) {
                    return fm.get(s);
                }
                if (s.contains(")")) {
                    int ri = s.indexOf(')');
                    if (ri < s.length() - 1 && Character.isDigit(s.charAt(ri + 1))) {
                        fm.put(s, -1);
                        return -1;
                    }
                    int li = -1;
                    for (int i = ri - 1; i >= 0; i--) {
                        if (s.charAt(i) == '(') {
                            li = i;
                            break;
                        }
                    }
                    if (li < 0 || (li > 0 && Character.isDigit(s.charAt(li - 1)))) {
                        fm.put(s, -1);
                        return -1;
                    }
                    String ts = s.substring(li + 1, ri);
                    int tr = _f(ts);
                    if (tr == -1) {
                        fm.put(s, -1);
                        return -1;
                    }
                    fm.put(s, _f(s.substring(0, li) + tr + s.substring(ri + 1)));
                    return fm.get(s);
                }
                if (s.
