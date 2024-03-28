import java.util.*;

public class p03582 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        List<Integer> L = new ArrayList<>();
        for (int i = 0; i < a; i++) {
            L.add(0);
        }
        for (int i = 0; i < b; i++) {
            L.add(1);
        }
        for (int i = 0; i < c; i++) {
            L.add(2);
        }
        while (L.size() > 1) {
            L.set(0, L.get(0) + L.get(L.size() - 1));
            L.remove(L.size() - 1);
            Collections.sort(L);
        }
        for (int i = 0; i < L.size(); i++) {
            System.out.print(L.get(i));
        }
    }
}