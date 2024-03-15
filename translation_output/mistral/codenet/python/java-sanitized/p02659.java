import java.util.*;
import java.math.*;

public class p02659 {
    static int mod = (int) (1e9 + 7);
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String A = sc.nextLine();
        String B = sc.nextLine();
        System.out.println(BigInteger.valueOf(Long.parseLong(A)).multiply(BigInteger.valueOf(Long.parseLong(B))).mod(BigInteger.valueOf(mod)));
    }
}