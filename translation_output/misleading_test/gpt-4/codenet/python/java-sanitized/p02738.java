import java.util.Scanner;
import java.math.BigInteger;

public class p02738 {
    private static final int MAX = (int) 3e6;
    private static BigInteger[] d = new BigInteger[MAX];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int M = scanner.nextInt();
        scanner.close();

        int l = n * 3 + 1;
        for (int i = 0; i < d.length; i++) {
            d[i] = BigInteger.ZERO;
        }
        d[0] = BigInteger.ONE;

        for (int i = 1; i < l; i++) {
            int j = i - 1, k = i - 2;
            d[i] = roll(d[k].multiply(BigInteger.valueOf(k)).add(roll(d[j], -1).multiply(BigInteger.valueOf(j))), -1).add(roll(d[j], 1));
            d[i] = d[i].mod(BigInteger.valueOf(M));
        }

        BigInteger sum = BigInteger.ZERO;
        for (int i = 0; i < l; i++) {
            sum = sum.add(d[l - 1].shiftRight(l - i - 1).and(BigInteger.ONE));
        }

        System.out.println(sum.mod(BigInteger.valueOf(M)));
    }

    private static BigInteger roll(BigInteger number, int amount) {
        if (amount == 1) {
            return number.shiftLeft(1).or(number.shiftRight(d.length - 1));
        } else if (amount == -1) {
            return number.shiftRight(1).or(number.shiftLeft(d.length - 1).and(BigInteger.ONE));
        }
        return number;
    }
}