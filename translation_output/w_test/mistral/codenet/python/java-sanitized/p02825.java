import java.util.ArrayList;
import java.util.List;

public class p02825 {
    public static void main(String[] args) {
        int n = 6;
        List<String> a = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            a.add(new StringBuilder().repeat(".", n).toString());
        }
        if (n == 2) {
            System.out.println(-1);
            return;
        }
        if (n == 3) {
            a.get(0).setCharAt(0, 'a');
            a.get(0).setCharAt(2, 'b');
            a.get(1).setCharAt(0, 'a');
            a.get(1).setCharAt(1, 'c');
            a.get(2).setCharAt(0, 'd');
            System.out.println(a.get(0));
            System.out.println(a.get(1));
            System.out.println(a.get(2));
            return;
        }
        if (n == 5) {
            a.get(0).setCharAt(0, 'a');
            a.get(0).setCharAt(2, 'b');
            a.get(1).setCharAt(0, 'a');
            a.get(1).setCharAt(1, 'c');
            a.get(2).setCharAt(0, 'd');
            a.get(3).setCharAt(0, 'g');
            a.get(3).setCharAt(2, 'e');
            a.get(4).setCharAt(0, 'g');
            a.get(4).setCharAt(1, 'f');
            System.out.println(a.get(0));
            System.out.println(a.get(1));
            System.out.println(a.get(2));
            System.out.println(a.get(3));
            System.out.println(a.get(4));
            return;
        }
        if (n == 7) {
            a.get(0).setCharAt(0, '.');
            a.get(0).setCharAt(1, 'a');
            a.get(0).setCharAt(3, 'b');
            a.get(1).setCharAt(0, '.');
            a.get(1).setCharAt(1, 'a');
            a.get(1).setCharAt(3, 'c');
            a.get(2).setCharAt(0, '.');
            a.get(2).setCharAt(1, 'a');
            a.get(2).setCharAt(3, 'b');
            a.get(3).setCharAt(0, '.');
            a.get(3).setCharAt(1, 'a');
            a.get(3).setCharAt(3, 'd');
            a.get(4).setCharAt(0, '.');
            a.get(4).setCharAt(1, 'a');
            a.get(4).setCharAt(3, 'e');
            a.get(5).setCharAt(0, '.');
            a.get(5).setCharAt(1, 'a');
            a.get(5).setCharAt(3, 'f');
            a.get(6).setCharAt(0, '.');
            a.get(6).setCharAt(1, 'a');
            a.get(6).setCharAt(3, 'b');
            System.out.println(a.get(0));
            System.out.println(a.get(1));
            System.out.println(a.get(2));
            System.out.println(a.get(3));
            System.out.println(a.get(4));
            System.out.println(a.get(5));
            System.out.println(a.get(6));
            return;
        }
        for (int i = 0; i < n; i++) {
            if (i == 0 || i == n - 1) {
                a.get(i).setCharAt(i, 'a');
            } else {
                a.get(i).setCharAt(i, 'b');
            }
        }
        if (n % 2 == 0) {
            for (int i = 0; i < n / 2; i++) {
                a.get(i).setCharAt(i, 'c');
                a.get(i).setCharAt(i + 1, 'd');
            }
        } else {
            for (int i = 0; i < n / 2 - 1; i++) {
                a.get(i).setCharAt(i, 'c');
                a.get(i).setCharAt(i + 2, 'd');
            }
            a.get(n / 2 - 1).setCharAt(0, 'c');
            a.get(n / 2 - 1).setCharAt(1, 'd');
        }
        for (String s : a) {
            System.out.println(s);
        }
    }
}