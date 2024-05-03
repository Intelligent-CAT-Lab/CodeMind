Here is the Java version of your Python code:

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(main());
    }

    public static int main() {
        String s = System.console().readLine();
        Map<List<Character>, int[]> fm = new HashMap<>();

        List<Character> a = new ArrayList<>();
        for (char c : s.toCharArray()) {
            if ('0' <= c && c <= '9') {
                int ci = c - '0';
                if (!a.isEmpty() && Character.isDigit(a.get(a.size() - 1))) {
                    a.set(a.size() - 1, (char) (a.get(a.size() - 1) * 10 + ci));
                } else {
                    a.add(c);
                }
            } else {
                a.add(c);
            }
        }

        int[] f(List<Character> a) {
            List<Character> key = new ArrayList<>(a);
            if (fm.containsKey(key)) {
                return fm.get(key);
            }
            if (a.size() == 2) {
                int[] r = new int[]{a.get(0), a.get(0)};
                fm.put(key, r);
                return r;
            }
            for (int i = 1; i < a.size() - 1; i++) {
                if (!"+-".contains(String.valueOf(a.get(i))) || (i > 1 && a.get(i - 2) == '(') || (i + 2 < a.size() && a.get(i + 2) == ')')) {
                    continue;
                }
                int[] fl = f(a.subList(0, i));
                int[] fr = f(a.subList(i + 1, a.size()));
                int[] r;
                if (a
