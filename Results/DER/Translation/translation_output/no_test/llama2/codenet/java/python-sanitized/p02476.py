import java.io.BufferedInputStream;
import java.math.BigInteger;
import java.util.Scanner;

class p02476:
    def main(self, args):
        in =Scanner(new BufferedInputStream(System.in))
        while in.hasNext():
            a = in.nextBigInteger()
            b = in.nextBigInteger()
            print(a.remainder(b))
        in.close()