import java.util.*;

public class p02742 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int W = sc.nextInt();
        int ans = (H!= 1 && W!= 1)? (H*W/2) : 1;
        System.out.println(ans);
    }
}