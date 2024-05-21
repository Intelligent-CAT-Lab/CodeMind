import java.util.*;

public class p01829 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int l = s.length();
        int n = Integer.parseInt(s);
        int m = Integer.MAX_VALUE;
        String r = "";
        int t = (int)Math.pow(10, l);
        for (int i = 0; i < Math.pow(10, l); i++) {
            List<Integer> list = new ArrayList<>();
            int tmp = i;
            for (int j = 0; j < l; j++) {
                list.add(tmp % 10);
                tmp /= 10;
            }
            Collections.shuffle(list);
            int b = 0;
            for (int j = 0; j < l; j++) {
                b = b * 10 + list.get(j);
            }
            int tm = Math.max(Math.abs(n - b), t - Math.abs(n - b));
            if (m > tm) {
                m = tm;
                StringBuilder sb = new StringBuilder();
                for (int j = 0; j < l; j++) {
                    sb.append(list.get(j));
                }
                r = sb.toString();
            }
        }
        System.out.println(r);
    }
}