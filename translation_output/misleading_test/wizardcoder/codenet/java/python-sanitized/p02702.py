import java.util.*;

public class p02702 {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char c[] = str.toCharArray();
        int n = str.length();
        int p = 2019;
        
        long ans = 0;
        
        int[] d = new int[n+1];
        int ten = 1;
        
        for (int i = n - 1; i >= 0; i--) {
            int a = ((c[i] - '0') * ten) % p;
            d[i] = (d[i+1] + a) % p;
            ten = (ten * 10) % p;
        }
        
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = n; i >= 0; i--) {
            int key = d[i];
            if (!map.containsKey(key)) {
                map.put(key, 1);
            } else {
                int val = map.get(key);
                map.put(key, val + 1);
            }
        }
        for (Integer key : map.keySet()) {
            int val = map.get(key);
            ans += (long)val * (val-1) / 2;
        }
        System.out.println(ans);
    }
}