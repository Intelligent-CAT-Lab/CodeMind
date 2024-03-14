import java.util.*;

public class codeforces_242_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        int x = Integer.parseInt(input[0]);
        int y = Integer.parseInt(input[1]);
        int a = Integer.parseInt(input[2]);
        int b = Integer.parseInt(input[3]);
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