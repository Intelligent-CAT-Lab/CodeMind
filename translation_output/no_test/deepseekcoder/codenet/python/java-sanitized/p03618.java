import java.util.*;
import java.math.*;

public class p03618 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        s = new String(chars);
        List<Character> list = new ArrayList<>();
        for (char c : s.toCharArray()) list.add(c);
        int l = s.length();
        BigInteger res = BigInteger.valueOf(l).multiply(BigInteger.valueOf(l - 1)).divide(BigInteger.valueOf(2)).add(BigInteger.ONE);
        for (char c : new HashSet<>(list)) {
            int p = Collections.frequency(list, c);
            res = res.subtract(BigInteger.valueOf(p).multiply(BigInteger.valueOf(p - 1)).divide(BigInteger.valueOf(2)));
        }
        System.out.println(res);
    }
}