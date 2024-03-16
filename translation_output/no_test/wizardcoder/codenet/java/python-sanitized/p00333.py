import java.util.Scanner;

class p00333:

    @staticmethod
    def gcd(x, y):
        if y == 0:
            return x
        else:
            return p00333.gcd(y, x % y)

    @staticmethod
    def main(args):
        sc = Scanner(System.in)
        W = sc.nextInt()
        H = sc.nextInt()
        WH = p00333.gcd(W, H)
        C = sc.nextInt()

        a = (W/WH)*(H/WH)

        print(a*C)

if __name__ == '__main__':
    p00333.main(None)