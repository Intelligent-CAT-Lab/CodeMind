import java.util.*;

public class p01542 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> results = new ArrayList<>();

        while (true) {
            String n = scanner.next();
            if (n.equals("0")) {
                break;
            }
            results.add(f(n));
        }

        for (int result : results) {
            System.out.println(result);
        }
    }

    static int f(String s) {
        Map<String, Integer> fm = new HashMap<>();
        int r = -1;

        int _f(String s) {
            if (fm.containsKey(s)) {
                return fm.get(s);
            }
            if (s.contains(")")) {
                int ri = s.indexOf(')');
                if (ri < s.length() - 1 && "01".contains(String.valueOf(s.charAt(ri + 1)))) {
                    return -1;
                }
                int li = -1;
                for (int i = ri - 1; i >= 0; i--) {
                    if (s.charAt(i) == '(') {
                        li = i;
                        break;
                    }
                }
                if (li > 0 && "01".contains(String.valueOf(s.charAt(li - 1)))) {
                    return -1;
                }
                String ts = s.substring(li + 1, ri);
                if (!ts.contains("+") && !ts.contains("-