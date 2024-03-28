import java.util.Scanner;

public class codeforces_622_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int l = 1;
        int r = n;
        
        while (l < r) {
            int mid = l + (r - l) / 2;
            double idxcnt = mid * (mid + 1) / 2.0;
            
            if (idxcnt < n) {
                l = mid + 1;
            } else {
                r = mid;
            }
        }
        
        l -= 1;
        int idxcnt = (int)((l * (l + 1)) / 2);
        System.out.println(n - idxcnt);
    }
}