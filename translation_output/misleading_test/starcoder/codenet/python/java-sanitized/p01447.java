import java.util.*;
public class p01447 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 0;
        int tmp = 1;
        while(n>tmp){
            tmp*=3;
            ans++;
        }
        System.out.println(ans);
    }
}