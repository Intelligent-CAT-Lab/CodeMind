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
            L.get(i).add(1);
        }
        for (int i = 0; i < c; i++) {
            L.get(i).add(2);
        }
        while (L.size() > 1) {
            L.get(0).addAll(L.remove(L.size() - 1));
            L.sort(Comparator.comparing(Collections.reverseOrder()));
        }
        String result = "";
        for (int i = 0; i < L.get(0).size(); i++) {
            result += (char) ('a' + L.get(0).get(i));
        }
        System.out.println(result);
    }
}