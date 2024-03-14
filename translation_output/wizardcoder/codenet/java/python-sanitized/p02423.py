import java.util.Scanner;

class p02423:

    @staticmethod
    def main(args):
        with Scanner(System.in) as sc:
            x = sc.nextLong()
            twobit = Long.toBinaryString(x)
            left = Long.toBinaryString(x<<1)  #å·¦ã·ãã
            right = Long.toBinaryString(x>>1)  #å³ã·ãã
            twobit = p02423.to32(twobit)
            left = p02423.to32(left)
            right = p02423.to32(right)
            print(twobit)
            for i in range(32):
                if twobit[i] == '0':
                    print('1', end='')
                else:
                    print('0', end='')
            print()
            print(left + '\n' + right)

    #æ¡æ°ã32ã«ãã
    @staticmethod
    def to32(s):
        a = 32-len(s)
        if a!= 0:
            for i in range(a):
                s = '0' + s
        if a < 0:
            s = s[-32:]
        return s

if __name__ == '__main__':
    p02423.main(None)