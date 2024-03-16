import java.util

class p03797:
    def main(self, args):
        sc = java.util.Scanner(System.in)
        N = sc.nextLong()
        M = sc.nextLong()
        sum = 0
        if N * 2 > M:
            sum = M / 2
        elif M > N * 2:
            sum = N
            sum = sum + (M - N * 2) / 4
        else:
            sum = N
        print(sum)