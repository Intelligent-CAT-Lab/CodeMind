import java.util.Scanner;

public class p02775 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        int[] n_arr = new int[n.length() + 1];
        for (int i = 0; i < n.length(); i++) {
            n_arr[i] = Integer.parseInt(String.valueOf(n.charAt(n.length() - i - 1)));
        }
        int s = 0;
        int res = 0;
        for (int i = 0; i < n_arr.length - 1; i++) {
            int k = n_arr[i] + s;
            if (k < 5 || (k == 5 && n_arr[i + 1] < 5)) {
                res += k;
                s = 0;
            } else {
                res += 10 - k;
                s = 1;
            }
        }
        res += s;
        System.out.println(res);
    }
}