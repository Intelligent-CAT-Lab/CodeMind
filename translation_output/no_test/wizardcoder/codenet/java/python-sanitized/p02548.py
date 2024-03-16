import java.math.BigInteger
import java.util.Scanner

def main():
    sc = Scanner(System.in)
    n = sc.nextInt()
    cnt = BigInteger.ZERO
    for i in range(1, n+1):
        for j in range(1, n+1):
            if i*j < n:
                cnt = cnt.add(BigInteger.ONE)
            else:
                break
    print(cnt)

if __name__ == '__main__':
    main()