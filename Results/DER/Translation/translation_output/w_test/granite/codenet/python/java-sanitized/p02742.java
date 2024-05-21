import java.util.*;

public class p02742 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int W = sc.nextInt();
        int ans = 0;
        if (H == 1 || W == 1) {
            ans = 1;
        } else {
            ans = (H * W + 1) / 2;
        }
        System.out.println(ans);
    }
}