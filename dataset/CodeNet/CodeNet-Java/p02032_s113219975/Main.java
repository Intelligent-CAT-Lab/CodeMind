import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        TreeSet<Long> nums = new TreeSet<>();
        for (long i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                nums.add(-i);
                nums.add(-n / i);
            }
        }
        int max = nums.size() + 1;
        int min = 0;
        HashSet<Long> used = new HashSet<>();
        for (long x : nums) {
            if (used.contains(-x)) {
                continue;
            }
            min++;
            for (long i = 2; i <= Math.sqrt(-x); i++) {
                if (-x % i == 0) {
                    used.add(i);
                    used.add(-x / i);
                }
            }
        }
        if (min == 0) {
            min++;
        }
        System.out.println(min + " " + max);
    }
}
