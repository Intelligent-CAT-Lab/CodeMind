import java.util.*;
import java.lang.*;

class Main {
    public static void main(String[] args) {
        System.out.println(main());
    }

    public static int main() {
        String s = System.console().readLine();
        Map<List<Object>, int[]> fm = new HashMap<>();

        List<Object> a = new ArrayList<>();
        for (char c : s.toCharArray()) {
            if ('0' <= c && c <= '9') {
                int ci = c - '0';
                if (!a.isEmpty() && a.get(a.size() - 1) instanceof Integer) {
                    a.set(a.size() - 1, (int) a.get(a.size() - 1) * 10 + ci);
                } else {
                    a.add(ci);
                }
            } else {
                a.add(c);
            }
        }

        int[] f(List<Object> a) {
            List<Object> key = new ArrayList<>(a);
            if (fm.containsKey(key)) {
                return fm.get(key);
            }
            if (a.size() == 2) {
                int[] r = new int[]{Integer.MAX_VALUE, -Integer.MAX_VALUE};
                fm.put(key, r);
                return r;
            }
            int i = 0;
            while (i < a.size() && !(a.get(i) instanceof Character)) {
                i++;
            }
            if (i > 0) {
                a = a.subList(i, a.size());
            }
            i = a.size() - 1;
            while (i >= 0 && !(a.get(i) instanceof Character)) {
                i--;
            }
            if (i < a.size() - 1) {
                a = a.subList(0, i + 1);
            }
            if (a.size() == 1) {
                int[] r = new