import java.util.*;

public class p03582 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

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
            L.set(0, L.get(0) + L.remove(L.size() - 1));
            Collections.sort(L);
        }

        StringBuilder sb = new StringBuilder();
        for (int i : L) {
            sb.append((char) ('a' + i));
        }
        System.out.println(sb.toString());
    }
}