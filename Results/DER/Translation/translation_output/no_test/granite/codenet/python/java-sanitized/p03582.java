import java.util.*;

public class p03582 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        int a = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[1]);
        int c = Integer.parseInt(input[2]);

        List<List<Integer>> L = new ArrayList<>();
        for (int i = 0; i < a; i++) {
            L.add(Collections.singletonList(0));
        }
        for (int i = 0; i < b; i++) {
            L.add(Collections.singletonList(1));
        }
        for (int i = 0; i < c; i++) {
            L.add(Collections.singletonList(2));
        }

        while (L.size() > 1) {
            List<Integer> first = L.get(0);
            first.set(0, first.get(0) + L.remove(L.size() - 1).get(0));
            L.sort(Comparator.comparingInt(l -> l.get(0)));
        }

        StringBuilder sb = new StringBuilder();
        for (int i : L.get(0)) {
            sb.append("abc".charAt(i));
        }
        System.out.println(sb.toString());
    }
}