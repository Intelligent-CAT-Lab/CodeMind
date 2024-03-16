import java.util.*;

public class p02550 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int m = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(x);
        HashSet<Integer> s = new HashSet<>();
        s.add(x);
        int h = -1;
        int r = 0;
        for (int i = 0; i < n - 1; i++) {
            int val = (int) Math.pow(arr.get(i), 2) % m;
            if (!s.contains(val)) {
                arr.add(val);
                s.add(val);
            } else {
                h = i;
                r = val;
                break;
            }
        }
        int res = 0;
        for (int i = 0; i < arr.size(); i++) {
            res += arr.get(i);
        }
        if (h != -1) {
            ArrayList<Integer> new_arr = new ArrayList<>();
            for (int i = arr.indexOf(r); i < arr.size(); i++) {
                new_arr.add(arr.get(i));
            }
            int rest = n - (h + 1);
            int c = new_arr.size();
            int q = rest / c;
            int ssum = 0;
            for (int i = 0; i < new_arr.size(); i++) {
                ssum += new_arr.get(i);
            }
            ssum *= q;
            int r1 = rest % c;
            for (int i = 0; i < r1; i++) {
                ssum += new_arr.get(i);
            }
            res += ssum;
        }
        System.out.println(res);
    }
}