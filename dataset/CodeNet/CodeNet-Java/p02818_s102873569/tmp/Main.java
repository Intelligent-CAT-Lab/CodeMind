import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        String line1 = sc.nextLine();
System.out.println("[INST]6;line1;sc.nextLine();"+line1);
        String[] array = line1.split(" ");
System.out.println("[INST]7;array;line1.split(' ');"+array);
        
        long a = Long.parseLong(array[0]);
System.out.println("[INST]9;a;Long.parseLong(array[0]);"+a);
        long b = Long.parseLong(array[1]);
System.out.println("[INST]10;b;Long.parseLong(array[1]);"+b);
        long k = Long.parseLong(array[2]);
System.out.println("[INST]11;k;Long.parseLong(array[2]);"+k);
        
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
