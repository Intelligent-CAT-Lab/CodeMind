import java.util.*;

public class Main {
    static HashMap<Integer, HashMap<Integer, Long>> dp = new HashMap<>();
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        long total = 0;
var newVariable_0 = Math.pow(2, k - 1);        for (int i = 1; i * newVariable_0 <= n; i++) {
            total += search(i, k - 1, n);
        } 
        System.out.println(total);
    }
    
    static long search(int num, int count, int max) {
        if (count == 0) {
            return 1;
        }
var newVariable_1 = dp.containsKey(num);        if (newVariable_1) {
var newVariable_2 = dp.get(num).containsKey(count);var newVariable_3 = dp.get(num);            if (newVariable_3.containsKey(count)) {
var newVariable_4 = dp.get(num).get(count);var newVariable_5 = dp.get(num);                return newVariable_5.get(count);
            }
        }
        long total = 0;
var newVariable_6 = Math.pow(2, count - 1);        for (int i = 2; num * i * newVariable_6 <= max; i++) {
            total += search(num * i, count - 1, max);
        }
var newVariable_7 = dp.containsKey(num);        if (newVariable_7) {
var newVariable_8 = dp.get(num).put(count, total);var newVariable_9 = dp.get(num);            newVariable_9.put(count, total);
        } else {
            HashMap<Integer, Long> map = new HashMap<>();
var newVariable_10 = map.put(count, total);var newVariable_11 = dp.put(num, map);        }
        return total;
    }
}
