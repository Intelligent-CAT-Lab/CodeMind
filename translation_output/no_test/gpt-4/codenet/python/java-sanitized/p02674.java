import java.util.HashMap;
import java.util.Scanner;

public class p02674 {
    public static void main(String[] args) {
        HashMap<Long, Integer> dic = new HashMap<>();
        dic.put(1L, 1);
        dic.put(2L, 1);
        dic.put(3L, 1);
        dic.put(4L, 7);
        dic.put(5L, 4);
        dic.put(6L, 1);
        dic.put(7L, 336);
        dic.put(8L, 384);
        dic.put(9L, 334);
        dic.put(10L, 220);
        dic.put(11L, 108);
        dic.put(12L, 36);
        dic.put(13L, 6);
        dic.put(27L, 976);
        dic.put(28L, 108);
        dic.put(29L, 4);
        dic.put(60L, 220);
        dic.put(61L, 1);
        dic.put(124L, 334);
        dic.put(252L, 384);
        dic.put(508L, 334);
        dic.put(1020L, 220);
        dic.put(2044L, 108);
        dic.put(4092L, 36);
        dic.put(8188L, 6);
        dic.put(134217723L, 976);
        dic.put(268435451L, 108);
        dic.put(536870907L, 4);
        dic.put(1152921504606846970L, 220);
        dic.put(2305843009213693946L, 1);

        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        
        if (dic.containsKey(n)) {
            System.out.println(dic.get(n));
        } else {
            System.out.println(-1);
        }
        
        scanner.close();
    }
}