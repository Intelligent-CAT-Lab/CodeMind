import java.util.*;

public class p01813 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Map<List<Object>, int[]> fm = new HashMap<>();

        List<Object> a = new ArrayList<>();
        for (char c : s.toCharArray()) {
            if (c >= '0' && c <= '9') {
                int ci = Character.getNumericValue(c);
                if (!a.isEmpty() && a.get(a.size() - 1) instanceof Integer) {
                    a.set(a.size() - 1, (int) a.get(a.size() - 1) * 10 + ci);
                } else {
                    a.add(ci);
                }
            } else {
                a.add(c);
            }
        }

        System.out.println(findResult(a, fm)[1]);
    }

    public static int[] findResult(List<Object> a, Map<List<Object>, int[]> fm) {
        List<Object> key = new ArrayList<>(a);
        if (fm.containsKey(key)) {
            return fm.get(key);
        }
        if (a.size() == 2) {
            int[] result = {Integer.MAX_VALUE, Integer.MIN_VALUE};
            return result;
        }
        
        int n = a.size();
        int[] ri = {Integer.MAX_VALUE};
        int[] ra = {Integer.MIN_VALUE};
        
        for (int i = 0; i < n; i++) {
            if (!a.get(i).equals('(')) {
                a = a.subList(i, n);
                break;
            }
        }
        for (int i = n - 1; i >= 0; i--) {
            if (!a.get(i).equals(')')) {
                a = a.subList(0, i + 1);
                break;
            }
        }
        
        if (a.size() == 1) {
            int[] r = {(int) a.get(0), (int) a.get(0)};
            fm.put(key, r);
            return r;
        }

        for (int i = 1; i < n - 1; i++) {
            if (!(a.get(i) instanceof Character) || (i > 1 && a.get(i - 2).equals('(')) || (i + 2 < n && a.get(i + 2).equals(')'))) {
                continue;
            }
            int[] fl = findResult(a.subList(0, i), fm);
            int[] fr = findResult(a.subList(i + 1, n), fm);
            if (a.get(i).equals('+')) {
                ri = Arrays.copyOf(ri, ri.length + 1);
                ra = Arrays.copyOf(ra, ra.length + 1);
                ri[ri.length - 1] = fl[0] + fr[0];
                ra[ra.length - 1] = fl[1] + fr[1];
            } else {
                ri = Arrays.copyOf(ri, ri.length + 1);
                ra = Arrays.copyOf(ra, ra.length + 1);
                ri[ri.length - 1] = fl[0] - fr[1];
                ra[ra.length - 1] = fl[1] - fr[0];
            }
        }

        int[] r = {Arrays.stream(ri).min().getAsInt(), Arrays.stream(ra).max().getAsInt()};
        fm.put(key, r);
        return r;
    }
}