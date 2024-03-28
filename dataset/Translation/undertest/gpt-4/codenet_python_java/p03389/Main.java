import java.util.Arrays;
import java.util.Scanner;

public class p03389 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int A = in.nextInt();
        int B = in.nextInt();
        int C = in.nextInt();
        
        int[] a = {A, B, C};
        Arrays.sort(a);
        
        int s = 0;
        
        for(int i = 0; i < 2; i++) {
            int tmp = a[2] - a[i];
            
            s += tmp / 2;
            a[i] += tmp / 2 * 2;
        }
        
        s += (a[0] + a[1] + a[2]) % 3;
        
        System.out.println(s);
        
        in.close();
    }
}