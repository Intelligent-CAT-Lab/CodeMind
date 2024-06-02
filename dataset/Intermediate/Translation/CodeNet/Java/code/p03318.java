import java.util.*;
import java.util.stream.*;
 
public class p03318 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int K = in.nextInt();
        long num = 0, d = 1;
        for(int i = 0; i < K; i++)  {
            num += d;
            if(calc(num + 2 * d) < calc(num + d)) {
                d *= 10L;
            }
            System.out.println(num);
        }
    }
 
    public static double calc(long num) {
        double n = (double) num;
        double sum = 0;
        while(num != 0L) {
            sum += num % 10;
            num /= 10;
        }
        return n / sum;
    }
}