import java.util.*;

public class p03789 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }
        Collections.reverse(list);
        int lb = 0, ub = list.size();
        while (ub - lb > 1) {
            int mid = (lb + ub) / 2;
            if (check(9 * mid)) {
                ub = mid;
            } else {
                lb = mid;
            }
        }
        System.out.println(ub);
    }

    public static int check(int x) {
        int g = 0;
        for (int i : list) {
            x -= (x + g - i) % 10;
            if (x < 0) {
                break;
            }
            g = (x + g) / 10;
        }
        return x >= 0;
    }
}