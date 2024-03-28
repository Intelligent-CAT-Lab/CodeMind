import java.util.Scanner;

public class codeforces_622_A {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int l = 1, r = n;
        
        while ( l < r ) {
            int mid = l + ( r - l ) / 2;
            long idxcnt = (long) mid * (mid + 1) / 2;
            if ( idxcnt < n ) {
                l = mid + 1;
            } else {
                r = mid;
            }
        }
        
        l -= 1;
        long idxcnt = (long) l * (l + 1) / 2;
        System.out.println(n - idxcnt);
        
        scanner.close();
    }
}