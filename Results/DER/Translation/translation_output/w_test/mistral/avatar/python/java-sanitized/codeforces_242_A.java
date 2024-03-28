import java.util.*;

public class codeforces_242_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x, y, a, b;
        String input = sc.nextLine();
        String[] split = input.split(" ");
        a = Integer.parseInt(split[0]);
        b = Integer.parseInt(split[1]);
        x = Integer.parseInt(split[2]);
        y = Integer.parseInt(split[3]);

        List<List<Integer>> c = new ArrayList<>();
        for (int i = a; i <= x; i++) {
            for (int j = b; j <= y; j++) {
                if (i > j) {
                    List<Integer> temp = new ArrayList<>();
                    temp.add(i);
                    temp.add(j);
                    c.add(temp);
                }
            }
        }

        System.out.println(c.size());
        for (List<Integer> list : c) {
            System.out.println(Arrays.toString(list.toArray()));
        }
    }
}