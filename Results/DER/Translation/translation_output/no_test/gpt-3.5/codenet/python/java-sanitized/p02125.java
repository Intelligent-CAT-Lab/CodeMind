import java.util.Scanner;

public class p02125 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int ans = 0;
        int x = 1;
        
        while (2*x - 1 <= N) {
            x = 2*x;
            ans++;
        }
        
        System.out.println(ans);
    }
}