import java.util.*;

public class p02775 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String n = scanner.next();
        List<Integer> nums = new ArrayList<>();
        for (int i = n.length() - 1; i >= 0; i--) {
            nums.add(n.charAt(i) - '0');
        }
        nums.add(0);
        int s = 0;
        int res = 0;
        for (int i = 0; i < nums.size() - 1; i++) {
            int k = nums.get(i) + s;
            if (k < 5 || (k == 5 && nums.get(i + 1) < 5)) {
                res += k;
                s = 0;
            } else {
                res += 10 - k;
                s = 1;
            }
        }
        res += s;
        System.out.println(res);
    }
}