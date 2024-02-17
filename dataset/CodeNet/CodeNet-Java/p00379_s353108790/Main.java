
import java.util.*;

class Main
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        int an = 0;
        
        for (int x = 1; x <= m; x++) {
            int y = 0;
            for(int X = x; X>0; X/=10){
                y += X % 10;
            }
            
            int y_plus_a = y + a;
            int xx = 1;
            for (int i = 0; i < n; i++) {
                xx *= y_plus_a;
            }
            if(xx == x){
                an++;
            }
        }
        System.out.println(an);
    }
}

