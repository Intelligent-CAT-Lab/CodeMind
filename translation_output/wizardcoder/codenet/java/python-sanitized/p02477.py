import java.util.*;
import java.math.*;

class p02477:
    def main(self):
        sc = Scanner(System.in)
        str = sc.next()
        A = BigInteger(str)
        str = sc.next()
        B = BigInteger(str)
        System.out.println(A.multiply(B))

if __name__ == '__main__':
    p02477().main()