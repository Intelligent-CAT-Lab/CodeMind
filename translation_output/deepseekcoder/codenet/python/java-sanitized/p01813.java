import java.util.*;
import java.lang.*;

class Main {
    static Map<String, int[]> fm = new HashMap<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        List<Object> a = new ArrayList<>();
        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                int ci = Character.getNumericValue(c);
                if (a.size() > 0 && a.get(a.size() - 1) instanceof Integer) {
                    a.set(a.size() - 1, (Integer) a.get(a.size() - 1) * 10 + ci);
                } else {
                    a.add(ci);
                }
            } else {
                a.add(c);
            }
        }
        System.out.println(f(a)[1]);
    }

    static int[] f(List<Object> a) {
        String key = a.toString();
        if (fm.containsKey(key)) {
            return fm.get(key);
        }
        if (a.size() == 2) {
            fm.put(key, new int[]{Integer.MAX_VALUE, Integer.MIN_VALUE});
            return fm.get(key);
        }
        for (int i = 0; i < a.size(); i++) {
            if (!(a.get(i) instanceof Character) || ((Character) a.get(i)) != '(') {
                if (i > 0) {
                    a = a.subList(i, a.size());
                }
                break;
            }
        }
        for (int i = a.size() - 1; i >= 0; i--) {
            if (!(a.get(i) instanceof Character) || ((Character) a.get(i)) != ')') {
                a = a.subList(0, i + 1);
                break;
            }
        }
        if (a.size() == 1) {
            int[] r = {(int) a.get(0), (int) a.get(0)};
            fm.put(key, r);
            return r;
        }

        List<Integer> ri = new ArrayList<>(Collections.nCopies(a.size() / 2 + 1, Integer.MAX_VALUE));
        List<Integer> ra = new ArrayList<>(Collections.nCopies(a.size() / 2 + 1, Integer.MIN_VALUE));
        int l = a.size();
        for (int i = 1; i < a.size() - 1; i++) {
            if (!(a.get(i) instanceof Character) ||
                    (i > 1 && ((Character) a.get(i - 2)) == '(') ||
                    (i + 2 < l && ((Character) a.get(i + 2)) == ')')) {
                continue;
            }
            int[] fl = f(a.subList(0, i));
            int[] fr = f(a.subList(i + 1, a.size()));
            if ((Character) a.get(i) == '+') {
                ri.add(fl[0] + fr[0]);
                ra.add(fl[1] + fr[1]);
            } else {
                ri.add(fl[0] - fr[1]);
                ra.add(fl[1] - fr[0]);
            }
        }
        int[] r = {Collections.min(ri), Collections.max(ra)};
        fm.put(key, r);
        return r;
    }
}