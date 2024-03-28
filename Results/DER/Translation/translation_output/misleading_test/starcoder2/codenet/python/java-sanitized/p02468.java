import java.util.*;
import java.math.*;

public class p02468 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int mod = (int)Math.pow(10,9)+7;
        System.out.println(BigInteger.valueOf(m).modPow(BigInteger.valueOf(n),BigInteger.valueOf(mod)));
    }
}



---