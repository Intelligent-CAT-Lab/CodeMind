import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        double n = sc.nextDouble();
        int k = sc.nextInt();
        sc.close();
        
        double winRatio = 0;
        for(int i = 1; i <= n; i++){
            int x = i;
            double m = 1;
            while(x < k) {
                x*=2;
                m*=2;
            }
            winRatio += (1d / n) / m;
        }
        System.out.println(winRatio);
    }
}
