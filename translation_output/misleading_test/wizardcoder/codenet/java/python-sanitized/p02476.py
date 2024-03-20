import java.io.BufferedInputStream
import java.math.BigInteger
import java.util.Scanner

def main():
    in = Scanner(BufferedInputStream(System.in))
    while in.hasNext():
        a = BigInteger(in.next())
        b = BigInteger(in.next())
        print(a.remainder(b))
    in.close()

if __name__ == '__main__':
    main()