import java.util.*;

public class p02450 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            list.add(i);
        }
        permute(list, 0, n - 1);
    }

    static void permute(List<Integer> list, int l, int r) {
        if (l == r) {
            System.out.println(list.toString().replace("[", "").replace("]", "").replace(", ", " "));
        } else {
            for (int i = l; i <= r; i++) {
                Collections.swap(list, l, i);
                permute(list, l + 1, r);
                Collections.swap(list, l, i);
            }
        }
    }
}