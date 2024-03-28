import java.util.*;

public class p01813 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Map<String, List<Integer>> fm = new HashMap<>();

        List<Object> a = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= '0' && c <= '9') {
                int ci = c - '0';
                if (a.size() > 0 && a.get(a.size() - 1) instanceof Integer) {
                    int prev = (int) a.remove(a.size() - 1);
                    a.add(prev * 10 + ci);
                } else {
                    a.add(ci);
                }
            } else {
                a.add(c);
            }
        }

        List<Integer> f(List<Object> a) {
            String key = a.toString();
            if (fm.containsKey(key)) {
                return fm.get(key);
            }
            if (a.size() == 2) {
                fm.put(key, Arrays.asList(Integer.MAX_VALUE, Integer.MIN_VALUE));
                return Arrays.asList(Integer.MAX_VALUE, Integer.MIN_VALUE);
            }
            for (int i = 0; i < a.size(); i++) {
                if (a.get(i)!= '(') {
                    if (i > 0) {
                        a = a.subList(i, a.size());
                    }
                    break;
                }
            }
            for (int i = a.size() - 1; i >= 0; i--) {
                if (a.get(i)!= ')') {
                    a = a.subList(0, i + 1);
                    break;
                }
            }
            if (a.size() == 1) {
                List<Integer> r = Arrays.asList((int) a.get(0), (int) a.get(0));
                fm.put(key, r);
                return r;
            }

            List<Integer> ri = new ArrayList<>();
            List<Integer> ra = new ArrayList<>();
            int l = a.size();
            for (int i = 1; i < l - 1; i++) {
                if (!(a.get(i) instanceof Character && ((Character) a.get(i)).charValue() == '+' || ((Character) a.get(i)).charValue() == '-')) {
                    continue;
                }
                if (i > 1 && a.get(i - 2) == '(') {
                    continue;
                }
                if (i + 2 < l && a.get(i + 2) == ')') {
                    continue;
                }
                List<Integer> fl = f(a.subList(0, i));
                List<Integer> fr = f(a.subList(i + 1, l));
                if (((Character) a.get(i)).charValue() == '+') {
                    ri.add(fl.get(0) + fr.get(0));
                    ra.add(fl.get(1) + fr.get(1));
                } else {
                    ri.add(fl.get(0) - fr.get(1));
                    ra.add(fl.get(1) - fr.get(0));
                }
            }

            List<Integer> r = Arrays.asList(Collections.min(ri), Collections.max(ra));
            fm.put(key, r);
            return r;
        }

        List<Integer> r = f(a);
        System.out.println(r.get(1));
    }
}