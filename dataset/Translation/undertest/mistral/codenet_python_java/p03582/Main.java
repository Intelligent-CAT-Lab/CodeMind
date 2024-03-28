import java.util.*;

public class p03582 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        List<List<Integer>> L = new ArrayList<>();
        for (int i = 0; i < a; i++) {
            L.add(new ArrayList<>());
        }
        for (int i = 0; i < b; i++) {
            L.add(Arrays.asList(1));
        }
        for (int i = 0; i < c; i++) {
            L.add(Arrays.asList(2));
        }
        while (L.size() > 1) {
            L.add(L.remove(0));
            L.sort(Comparator.comparingInt(list -> list.get(0)));
        }
        String result = "";
        for (int i = 0; i < L.get(0).size(); i++) {
            result += (char) ('a' + L.get(0).get(i));
        }
        System.out.println(result);
    }
}