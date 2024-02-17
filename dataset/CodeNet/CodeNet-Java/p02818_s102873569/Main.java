import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        String line1 = sc.nextLine();
        String[] array = line1.split(" ");
        
        long a = Long.parseLong(array[0]);
        long b = Long.parseLong(array[1]);
        long k = Long.parseLong(array[2]);
        
        if(a > 0 && k > 0)
        {
            if(k >= a)
            {
                k -= a;
                a = 0;
            }
            else
            {
                a -= k;
                k = 0;
            }
        }
        if(b > 0 && k > 0)
        {
            if(k >= b)
            {
                k -= b;
                b = 0;
            }
            else
            {
                b -= k;
                k = 0;
            }
        }
        
        System.out.println(a + " " + b);
    }
}
