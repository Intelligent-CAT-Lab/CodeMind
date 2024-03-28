import java.util.*;

public class p03929 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] r = new int[12];
        for(int i=1; i<=11; i++){
            int m = 0;
            for(int j=1; j<=5; j++){
                int t = 0;
                for(int x=0; x<3; x++){
                    for(int y=0; y<3; y++){
                        t += 7*(i+y) + (j+x) - 7;
                    }
                }
                if(t % 11 == k) m++;
            }
            r[i] = m;
        }
        int a = n/11;
        int b = n%11;
        int ans = 0;
        ans += a*Arrays.stream(r).sum();
        if(b < 1) ans -= r[11];
        if(b < 2) ans -= r[10];
        if(b >= 3) ans += Arrays.stream(Arrays.copyOfRange(r, 0, b-2)).sum();
        System.out.println(ans);
    }
}