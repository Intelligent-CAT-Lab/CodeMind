import java.util.HashSet;
import java.util.Scanner;
import java.util.ArrayList;

public class p02550 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int x = scanner.nextInt();
        int m = scanner.nextInt();
        
        ArrayList<Integer> arr = new ArrayList<>();
        HashSet<Integer> s = new HashSet<>();
        s.add(x);
        arr.add(x);
        int h = -1;
        int r = 0;
        
        for (int i = 0; i < n - 1; i++) {
            int val = (int)(((long)arr.get(arr.size() - 1) * arr.get(arr.size() - 1)) % m);
            if (!s.contains(val)) {
                arr.add(val);
                s.add(val);
            } else {
                h = i;
                r = val;
                break;
            }
        }

        long res = 0;
        for (int num : arr) {
            res += num;
        }
        
        if (h != -1) {
            int indexOfR = arr.indexOf(r);
            ArrayList<Integer> new_arr = new ArrayList<>(arr.subList(indexOfR, arr.size()));
            int rest = n - (h + 1);
            int c = new_arr.size();
            long q = rest / c;
            long ssum = 0;
            for (int num : new_arr) {
                ssum += num;
            }
            ssum *= q;
            int rr = rest % c;
            for (int i = 0; i < rr; i++) {
                ssum += new_arr.get(i);
            }
            res += ssum;
        }
        
        System.out.println(res);
        scanner.close();
    }
}