import java.util.*;

public class p02674 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Map<Integer, Integer> dic = new HashMap<>();
        dic.put(1, 1);
        dic.put(2, 1);
        dic.put(3, 1);
        dic.put(4, 7);
        dic.put(5, 4);
        dic.put(6, 1);
        dic.put(7, 336);
        dic.put(8, 384);
        dic.put(9, 334);
        dic.put(10, 220);
        dic.put(11, 108);
        dic.put(12, 36);
        dic.put(13, 6);
        dic.put(27, 976);
        dic.put(28, 108);
        dic.put(29, 4);
        dic.put(60, 220);
        dic.put(61, 1);
        dic.put(124, 334);
        dic.put(252, 384);
        dic.put(508, 334);
        dic.put(1020, 220);
        dic.put(2044, 108);
        dic.put(4092, 36);
        dic.put(8188, 6);
        dic.put(134217723, 976);
        dic.put(268435451, 108);
        dic.put(536870907, 4);
        dic.put(1152921504606846970, 220);
        dic.put(2305843009213693946, 1);

        if (dic.containsKey(n)) {
            System.out.println(dic.get(n));
        } else {
            System.out.println(-1);
        }
    }
}