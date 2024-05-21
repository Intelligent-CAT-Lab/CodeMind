import java.util.*;

public class p03269 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();

        int d = (int)Math.floor(Math.log(l) / Math.log(2));
        int n = d+1;
        int m = 2*d;
        List<List<Integer>> ans = new ArrayList<>();
        for (int i = 1; i < n; i++) {
            ans.add(Arrays.asList(i, i+1, 0));
            ans.add(Arrays.asList(i, i+1, (int)Math.pow(2, i-1)));
        }

        while (l > Math.pow(2, d)) {
            for (int i = n-1; i > 0; i--) {
                if (l - Math.pow(2, i-1) > Math.pow(2, d) - 1) {
                    ans.add(Arrays.asList(i, n, l - (int)Math.pow(2, i-1)));
                    m++;
                    l -= (int)Math.pow(2, i-1);
                    break;
                }
            }
        }

        System.out.println(n + " " + m);
        for (List<Integer> a : ans) {
            System.out.println(a.get(0) + " " + a.get(1) + " " + a.get(2));
        }
    }
}