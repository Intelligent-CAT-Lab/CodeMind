import java.util.*;

public class codeforces_242_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        List<List<Integer>> c = new ArrayList<>();
        for (int i = a; i <= x; i++) {
            for (int j = b; j <= y; j++) {
                if (i > j) {
                    List<Integer> pair = new ArrayList<>();
                    pair.add(i);
                    pair.add(j);
                    c.add(pair);
                }
            }
        }

        System.out.println(c.size());
        for (List<Integer> pair : c) {
            System.out.println(pair.get(0) + " " + pair.get(1));
        }
    }
}