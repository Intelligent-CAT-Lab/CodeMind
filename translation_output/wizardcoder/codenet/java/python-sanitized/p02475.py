import java.math.BigInteger
import java.util.Scanner

def main():
    scan = Scanner(System.in)
    a = BigInteger(scan.nextBigInteger())
    b = BigInteger(scan.nextBigInteger())
    System.out.println(a.divide(b))

if __name__ == '__main__':
    main()