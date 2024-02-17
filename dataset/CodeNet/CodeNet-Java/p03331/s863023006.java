import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = n;
        for(int a = 2; a <= n/2; a++) {
            int b = n - a;
            int sum = digit(a) + digit(b);
            ans = Math.min(sum,ans);
        }
        System.out.println(ans);
    }
    
    static int digit(int num) {
        int r = 0;
        while(true) {
            r += (num%10);
            num /= 10;
            if(num == 0) break;
        }
        return r;
    }
}