import java.math.BigInteger;
import java.util.Scanner;


def main():
    sc = Scanner(System.in)
    a = BigInteger(sc.next())
    b = BigInteger(sc.next())
    a = a.subtract(b)
    print(a)


if __name__ == '__main__':
    main()