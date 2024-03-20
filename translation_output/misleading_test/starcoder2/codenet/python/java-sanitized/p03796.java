import java.util.Scanner;
import java.math.BigInteger;

public class p03796 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        BigInteger bi = BigInteger.valueOf(n);
        System.out.println(bi.mod(BigInteger.valueOf(1000000007)));
    }
}

/01-introduction/01-introduction.md
# Introduction