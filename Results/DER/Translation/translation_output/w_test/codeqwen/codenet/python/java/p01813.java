Here is the Java version of your Python code:

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(main());
    }

    public static int main() {
        String s = System.console().readLine();
        Map<List<String>, int[]> fm = new HashMap<>();

        List<String> a = new ArrayList<>();
        for (char c : s.toCharArray()) {
            if ('0' <= c && c <= '9') {
                int ci = c - '0';
                if (!a.isEmpty() && a.get(a.size() - 1).matches("[0-9]+")) {
                    a.set(a.size() - 1, a.get(a.size() - 1) + String.valueOf(ci));
                } else {
                    a.add(String.valueOf(ci));
                }
            } else {
                a.add(String.valueOf(c));
            }
        }

        int[] f(List<String> a) {
            List<String> key = new ArrayList<>(a);
            if (fm.containsKey(key)) {
                return fm.get(key);
            }
            if (a.size() == 2) {
                int[] r = new int[]{Integer.MAX_VALUE, Integer.MIN_VALUE};
                fm.put(key, r);
                return r;
            }
            for (int i = 0; i < a.size(); i++) {
                if (!a.get(i).matches("[()+-]") || (i > 0 && a.get(i - 2).equals("(")) || (i + 2 < a.size() && a.get(i + 2).equals(")"))) {
                    continue;
                }
                List<String> la = new ArrayList<>(a.subList(0, i));
                List<String> ra = new ArrayList<>(a.subList(i + 1, a.size()));
                int
