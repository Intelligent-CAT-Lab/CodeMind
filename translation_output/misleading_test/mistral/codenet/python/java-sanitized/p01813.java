import java.util.*;

public class p01813 {
    static Map<String, List<Integer>> fm = new HashMap<>();
    static List<Integer> a = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        List<Integer> aList = new ArrayList<>();
        for (char c : s.toCharArray()) {
            if ('0' <= c <= '9') {
                aList.add(Integer.parseInt(String.valueOf(c)));
            } else {
                aList.add(c);
            }
        }
        a = aList;

        List<Integer> result = f(a);
        System.out.println(result.get(1));
    }

    public static List<Integer> f(List<Integer> a) {
        String key = Arrays.toString(a.toArray());
        if (fm.containsKey(key)) {
            return fm.get(key);
        }
        if (a.size() == 2) {
            fm.put(key, Arrays.asList(Integer.MAX_VALUE, Integer.MIN_VALUE));
            return Arrays.asList(Integer.MAX_VALUE, Integer.MIN_VALUE);
        }
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i) != '(') {
                if (i > 0) {
                    a = a.subList(i, a.size());
                }
                break;
            }
        }
        for (int i = a.size() - 1; i >= 0; i--) {
            if (a.get(i) != ')') {
                a = a.subList(0, i + 1);
                break;
            }
        }
        if (a.size() == 1) {
            List<Integer> r = new ArrayList<>();
            r.add(a.get(0));
            r.add(a.get(0));
            fm.put(key, r);
            return r;
        }
        List<Integer> ri = new ArrayList<>();
        List<Integer> ra = new ArrayList<>();
        int l = a.size();
        for (int i = 1; i < l - 1; i++) {
            if (!a.get(i) == '+' || (i > 1 && a.get(i - 2) == '(') || (i + 2 < l && a.get(i + 2) == ')')) {
                continue;
            }
            List<Integer> fl = f(a.subList(0, i));
            List<Integer> fr = f(a.subList(i + 1, a.size()));
            if (a.get(i) == '+') {
                ri.add(fl.get(0) + fr.get(0));
                ra.add(fl.get(1) + fr.get(1));
            } else {
                ri.add(fl.get(0) - fr.get(1));
                ra.add(fl.get(1) - fr.get(0));
            }
        }
        List<Integer> r = new ArrayList<>();
        r.add(Math.min(ri.stream().mapToInt(i -> i).toArray()));
        r.add(Math.max(ra.stream().mapToInt(i -> i).toArray()));
        fm.put(key, r);
        return r;
    }
}