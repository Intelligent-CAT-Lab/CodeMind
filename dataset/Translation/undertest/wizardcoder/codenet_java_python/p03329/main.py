import java.util.Arrays;
import java.util.Scanner;

class p03329:
    MAX_N = 110000
    memo = [-1] * MAX_N

    def __init__(self):
        pass

    def main(self):
        sc = Scanner(System.in)
        n = sc.nextInt()
        ans = self.calc(n)
        print(ans)

    def calc(self, n):
        if n == 0:
            return 0
        if self.memo[n]!= -1:
            return self.memo[n]

        res = n
        for pow6 in range(1, n+1):
            if pow6 * 6 > n:
                break
            res = min(res, self.calc(n - pow6) + 1)

        for pow9 in range(1, n+1):
            if pow9 * 9 > n:
                break
            res = min(res, self.calc(n - pow9) + 1)

        self.memo[n] = res
        return self.memo[n]

if __name__ == '__main__':
    p03329().main()