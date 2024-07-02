import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
System.out.println("[INST]5;n;sc.nextLong();"+n);
        TreeSet<Long> nums = new TreeSet<>();
        for (long i = 2; i <= Math.sqrt(n); i++) {
System.out.println("[INST]7;None;Math.sqrt(n);"+Math.sqrt(n));
            if (n % i == 0) {
                nums.add(-i);
System.out.println("[INST]9;None;nums.add(-i);"+nums.add(-i));
                nums.add(-n / i);
System.out.println("[INST]10;None;nums.add(-n / i);"+nums.add(-n / i));
            }
        }
        int max = nums.size() + 1;
System.out.println("[INST]13;None;nums.size();"+nums.size());
        int min = 0;
        HashSet<Long> used = new HashSet<>();
        for (long x : nums) {
            if (used.contains(-x)) {
System.out.println("[INST]17;None;used.contains(-x);"+used.contains(-x));
                continue;
            }
            min++;
            for (long i = 2; i <= Math.sqrt(-x); i++) {
System.out.println("[INST]21;None;Math.sqrt(-x);"+Math.sqrt(-x));
                if (-x % i == 0) {
                    used.add(i);
System.out.println("[INST]23;None;used.add(i);"+used.add(i));
                    used.add(-x / i);
System.out.println("[INST]24;None;used.add(-x / i);"+used.add(-x / i));
                }
            }
        }
        if (min == 0) {
            min++;
        }
        System.out.println(min + " " + max);
    }
}
