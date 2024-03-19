import java.util.ArrayList;
import java.util.List;

public class p02825 {
    public static void main(String[] args) {
        int n = 6;
        List<String> a = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            a.add(new StringBuilder().repeat(".", n).toString());
        }
        if (n % 2 == 1) {
            a.get(n - 5).setCharAt(n - 5, 'a');
            a.get(n - 5).setCharAt(n - 4, 'a');
            a.get(n - 5).setCharAt(n - 3, 'a');
            a.get(n - 5).setCharAt(n - 2, 'a');
            a.get(n - 5).setCharAt(n - 1, 'a');
            a.get(n - 4).setCharAt(n - 4, 'h');
            a.get(n - 4).setCharAt(n - 3, 'f');
            a.get(n - 3).setCharAt(n - 3, '.');
            a.get(n - 3).setCharAt(n - 2, '.');
            a.get(n - 2).setCharAt(n - 2, '.');
            a.get(n - 1).setCharAt(n - 1, '.');
            a.get(n - 1).setCharAt(n - 0, '.');
            n -= 5;
        }
        for (int i = 0; i < n; i++) {
            a.get(i).setCharAt(i, 'a');
            a.get(i).setCharAt(i + 1, 'a');
        }
        if (n % 4 == 0) {
            for (int i = 0; i < n; i += 2) {
                a.get(n - i - 2).setCharAt(i, 'c');
                a.get(n - i - 2).setCharAt(i + 1, 'd');
                a.get(n - i - 1).setCharAt(i, 'c');
                a.get(n - i - 1).setCharAt(i + 1, 'd');
            }
        } else {
            for (int i = 0; i < n - 2; i += 2) {
                a.get(i).setCharAt(i + 2, 'c');
                a.get(i).setCharAt(i + 3, 'd');
                a.get(i + 1).setCharAt(i + 2, 'c');
                a.get(i + 1).setCharAt(i + 3, 'd');
            }
            a.get(n - 2).setCharAt(0, 'c');
            a.get(n - 2).setCharAt(1, 'd');
            a.get(n - 1).setCharAt(0, 'c');
            a.get(n - 1).setCharAt(1, 'd');
        }
        for (String s : a) {
            System.out.println(s);
        }
    }
}