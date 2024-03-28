import java.io.BufferedInputStream
import java.math.BigInteger
import java.util.Scanner

def main():
    in = Scanner(BufferedInputStream(System.in))
    while in.hasNext():
        a = in.nextBigInteger()
        b = in.nextBigInteger()
        print(a.remainder(b))
    in.close()

if __name__ == '__main__':
    main()