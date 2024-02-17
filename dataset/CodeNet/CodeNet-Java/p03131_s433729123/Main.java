import java.util.*;

public class Main{

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        // input
        long k = scan.nextLong();
        long a = scan.nextLong();
        long b = scan.nextLong();

        // search
        if(b - a <= 2 || a  > k){
            System.out.println(k + 1);
        } else {
            long exchange = (k - a + 1) / 2;
            System.out.println(1 + (k - exchange * 2) + exchange * (b - a));
        }
        
    }
}