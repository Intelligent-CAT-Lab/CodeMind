import java.util.*;

public class p03582 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        List<List<Integer>> L = new ArrayList<>();
        L.addAll(Collections.nCopies(a, Arrays.asList(0)));
        L.addAll(Collections.nCopies(b, Arrays.asList(1)));
        L.addAll(Collections.nCopies(c, Arrays.asList(2)));
        while (L.size() > 1) {
            List<Integer> temp = new ArrayList<>();
            for (List<Integer> l : L) {
                temp.addAll(l);
            }
            L.clear();
            for (int i = 0; i < temp.size(); i += 3) {
                L.add(Arrays.asList(temp.get(i), temp.get(i+1), temp.get(i+2)));
            }
            L.sort((l1, l2) -> l