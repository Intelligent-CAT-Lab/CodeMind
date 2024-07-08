import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        TreeSet<Long> nums = new TreeSet<>();
var newVariable_0 = Math.sqrt(n);        for (long i = 2; i <= newVariable_0; i++) {
            if (n % i == 0) {
var newVariable_1 = nums.add(-i);var newVariable_2 = nums.add(-n / i);            }
        }
var newVariable_3 = nums.size();        int max = newVariable_3 + 1;
        int min = 0;
        HashSet<Long> used = new HashSet<>();
        for (long x : nums) {
var newVariable_4 = used.contains(-x);            if (newVariable_4) {
                continue;
            }
            min++;
var newVariable_5 = Math.sqrt(-x);            for (long i = 2; i <= newVariable_5; i++) {
                if (-x % i == 0) {
var newVariable_6 = used.add(i);var newVariable_7 = used.add(-x / i);                }
            }
        }
        if (min == 0) {
            min++;
        }
        System.out.println(min + " " + max);
    }
}
