import java.util.*;

public class Main {
    static HashMap<Integer, HashMap<Integer, Long>> dp = new HashMap<>();
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
System.out.println("[INST]6;n;sc.nextInt();"+n);
        int k = sc.nextInt();
System.out.println("[INST]7;k;sc.nextInt();"+k);
        long total = 0;
        for (int i = 1; i * Math.pow(2, k - 1) <= n; i++) {
System.out.println("[INST]9;None;Math.pow(2, k - 1);"+Math.pow(2, k - 1));
            total += search(i, k - 1, n);
        } 
        System.out.println(total);
    }
    
    static long search(int num, int count, int max) {
        if (count == 0) {
            return 1;
        }
        if (dp.containsKey(num)) {
System.out.println("[INST]19;None;dp.containsKey(num);"+dp.containsKey(num));
            if (dp.get(num).containsKey(count)) {
System.out.println("[INST]20;None;dp.get(num).containsKey(count);"+dp.get(num).containsKey(count));
System.out.println("[INST]20;None;dp.get(num);"+dp.get(num));
                return dp.get(num).get(count);
System.out.println("[INST]21;None;dp.get(num).get(count);"+dp.get(num).get(count));
System.out.println("[INST]21;None;dp.get(num);"+dp.get(num));
            }
        }
        long total = 0;
        for (int i = 2; num * i * Math.pow(2, count - 1) <= max; i++) {
System.out.println("[INST]25;None;Math.pow(2, count - 1);"+Math.pow(2, count - 1));
            total += search(num * i, count - 1, max);
        }
        if (dp.containsKey(num)) {
System.out.println("[INST]28;None;dp.containsKey(num);"+dp.containsKey(num));
            dp.get(num).put(count, total);
System.out.println("[INST]29;None;dp.get(num).put(count, total);"+dp.get(num).put(count, total));
System.out.println("[INST]29;None;dp.get(num);"+dp.get(num));
        } else {
            HashMap<Integer, Long> map = new HashMap<>();
            map.put(count, total);
System.out.println("[INST]32;None;map.put(count, total);"+map.put(count, total));
            dp.put(num, map);
System.out.println("[INST]33;None;dp.put(num, map);"+dp.put(num, map));
        }
        return total;
    }
}
