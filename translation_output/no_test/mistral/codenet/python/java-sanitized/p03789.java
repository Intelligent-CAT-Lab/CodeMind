import java.util.*;
public class p03789 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> n = new ArrayList<>(Arrays.asList(sc.nextLine().split(" ")));
        Collections.reverse(n);
        int lb = 0, ub = n.size();
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
        for (int i : n) {
            x -= (x + g - Integer.parseInt(i)) % 10;
            if (x < 0) {
                break;
            }
            g = (x + g) / 10;
        }
        return x >= 0;
    }
}