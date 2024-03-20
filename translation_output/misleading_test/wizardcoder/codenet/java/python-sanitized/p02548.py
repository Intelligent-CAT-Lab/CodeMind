import java.math.BigInteger
import java.util.Scanner

public class p02548:
    def main(self):
        sc = Scanner(System.in)
        n = sc.nextInt()
        cnt = BigInteger.ZERO
        for i in range(1, n+1):
            for j in range(1, n+1):
                if i*j < n:
                    cnt = cnt.add(BigInteger.ONE)
                else:
                    break
        System.out.println(cnt)