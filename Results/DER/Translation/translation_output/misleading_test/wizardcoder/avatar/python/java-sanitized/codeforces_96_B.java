import java.util.*;
public class codeforces_96_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> l = new ArrayList<>();
        gen(l, 0, 0, 0, n);
        Collections.sort(l);
        System.out.println(l.get(l.size()-1));
    }
    public static void gen(List<Integer> l, int number, int four, int seven, int n) {
        if (number > 10000000000) {
            return;
        }
        if (number > 0 && four == seven) {
            l.add(number);
        }
        if (number * 10 + 4 <= n) {
            gen(l, number * 10 + 4, four + 1, seven, n);
        }
        if (number * 10 + 7 <= n) {
            gen(l, number * 10 + 7, four, seven + 1, n);
        }
    }
}