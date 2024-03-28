import java.util.*;

public class p03582 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        List<Integer> L = new ArrayList<>();
        for (int i = 0; i < a; i++) L.add(0);
        for (int i = 0; i < b; i++) L.add(1);
        for (int i = 0; i < c; i++) L.add(2);

        while (L.size() > 1) {
            int first = L.get(0);
            L.remove(0);
            L.add(first);
            Collections.sort(L);
        }

        StringBuilder result = new StringBuilder();
        for (int i : L) {
            if (i == 0) {
                result.append('a');
            } else if (i == 1) {
                result.append('b');
            } else {
                result.append('c');
            }
        }

        System.out.println(result.toString());
    }
}