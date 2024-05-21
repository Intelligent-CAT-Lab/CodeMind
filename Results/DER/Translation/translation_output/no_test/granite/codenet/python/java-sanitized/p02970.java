import java.util.*;

public class p02970 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();
        int ans = -(-n/(2*d+1));
        System.out.println(ans);
    }
}