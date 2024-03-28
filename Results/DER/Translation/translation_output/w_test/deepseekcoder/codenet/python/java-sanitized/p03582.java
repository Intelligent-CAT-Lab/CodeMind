import java.util.*;

public class p03582 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        List<List<Integer>> L = new ArrayList<>();
        for (int i = 0; i < a; i++) L.add(new ArrayList<>(Arrays.asList(0)));
        for (int i = 0; i < b; i++) L.add(new ArrayList<>(Arrays.asList(1)));
        for (int i = 0; i < c; i++) L.add(new ArrayList<>(Arrays.asList(2)));

        while (L.size() > 1) {
            L.get(0).addAll(L.remove(L.size() - 1));
            L.sort(Comparator.comparingInt(List::size));
        }

        StringBuilder sb = new StringBuilder();
        for (int i : L.get(0)) {
            sb.append((char) ('a' + i));
        }
        System.out.println(sb.toString());
    }
}