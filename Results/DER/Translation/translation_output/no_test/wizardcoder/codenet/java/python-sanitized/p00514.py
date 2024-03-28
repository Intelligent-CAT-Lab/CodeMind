import java.util.*;
import java.math.*;

class p00514:
    def main(self):
        s = Scanner(System.in)
        a = s.nextInt()
        b = s.nextInt()
        c = s.nextInt()
        if a*b > c:
            System.out.println(0)
            System.exit(0)
        c -= a*b
        d = c + a - 1
        bi = BigInteger("1")
        for i in range(c):
            bi = bi.multiply(BigInteger(str(d-i)))
            bi = bi.divide(BigInteger(str(i+1)))
        System.out.println(bi.toString())

p00514().main()