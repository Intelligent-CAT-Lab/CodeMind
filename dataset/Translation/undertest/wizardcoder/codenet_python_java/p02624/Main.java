import java.util.*;

public class p02624 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for(int i=1; i<=n; i++){
            int count = 0;
            for(int j=1; j<=i; j++){
                if(i%j == 0) count++;
            }
            sum += count;
        }
        System.out.println(sum);
    }
}