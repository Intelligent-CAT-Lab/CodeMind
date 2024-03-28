import java.math.BigInteger;
import java.util.Scanner;

def main():
    in = Scanner(System.in)
    A = in.nextInt()
    B = in.nextInt()
    N = in.nextInt()
    bigA = BigInteger.valueOf(A)
    bigB = BigInteger.valueOf(B)
    
    for x in range(-1000, 1000):
        if (BigInteger.valueOf(x).pow(N).multiply(bigA).equals(bigB)):
            print(x)
            return
    print("No solution")

if __name__ == "__main__":
    main()