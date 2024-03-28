import java.util.*;

public class p01829 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        int l = s.length();
        int n = Integer.parseInt(s);
        int m = Integer.MAX_VALUE;
        String r = "";
        int t = (int) Math.pow(10, l);
        List<Integer> list = new ArrayList<>(Arrays.asList(0,1,2,3,4,5,6,7,8,9));
        Collections.sort(list);
        do {
            StringBuilder sb = new StringBuilder();
            for (int i : list) {
                sb.append(i);
            }
            int b = Integer.parseInt(sb.toString());
            int tm = Math.max(Math.abs(n-b), t-Math.abs(n-b));
            if (m > tm) {
                m = tm;
                r = sb.toString();
            }
        } while (nextPermutation(list));
        System.out.println(r);
    }

    public static boolean nextPermutation(List<Integer> a) {
        int n = a.size();
        for (int i = n - 2; i >= 0; i--) {
            if (a.get(i) < a.get(i + 1)) {
                for (int j = n - 1; j > i; j--) {
                    if (a.get(j) > a.get(i)) {
                        Collections.swap(a, i, j);
                        Collections.reverse(a.subList(i + 1, n));
                        return true;
                    }
                }
            }
        }
        return false;
    }
}