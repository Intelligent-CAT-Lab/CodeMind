import java.util.*;
public class p03196 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int p = sc.nextInt();
        int ans = 1;
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for (int i = 2; i <= Math.sqrt(p); i++) {
            int cnt = 0;
            while (p % i == 0) {
                cnt++;
                p /= i;
            }
            if (cnt!= 0) {
                arr.add(i);
                arr.add(cnt);
            }
        }
        if (p!= 1) {
            arr.add(p);
            arr.add(1);
        }
        if (arr.size() == 0) {
            arr.add(p);
            arr.add(1);
        }
        for (int i = 0; i < arr.size(); i += 2) {
            ans *= Math.pow(arr.get(i), arr.get(i + 1) / n);
        }
        System.out.println(ans);
    }
}