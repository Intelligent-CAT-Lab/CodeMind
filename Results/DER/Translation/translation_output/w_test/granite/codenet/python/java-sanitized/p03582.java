import java.util.*;

public class p03582 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        sc.close();

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
            List<Integer> first = L.remove(0);
            first.add(L.remove(L.size() - 1).get(0));
            L.add(first);
            Collections.sort(L, new Comparator<List<Integer>>() {
                @Override
                public int compare(List<Integer> o1, List<Integer> o2) {
                    return o1.get(0) - o2.get(0);
                }
            });
        }
        StringBuilder sb = new StringBuilder();
        for (int i : L.get(0)) {
            sb.append("abc".charAt(i));
        }
        System.out.println(sb.toString());
    }
}