import java.util
import java.math

class p02477:
    def main(self, args):
        sc = java.util.Scanner(System.in)
        str = sc.next()
        A = java.math.BigInteger(str)
        str = sc.next()
        B = java.math.BigInteger(str)
        print(A.multiply(B))