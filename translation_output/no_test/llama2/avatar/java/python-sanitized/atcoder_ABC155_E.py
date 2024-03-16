import java.util
import java.util.Map.Entry

class atcoder_ABC155_E:
    mod = (int) (10 ** 9 + 7)

    def main(self, args):
        sc = java.util.Scanner(System.in)
        S = "0" + sc.next()
        c = S.toCharArray()
        N = len(c)
        dp = [None] * (N + 1)
        dp[N] = [0, 10 - ord(c[0])]

        for i in range(N - 1, -1, -1):
            dp[i] = [None] * 2
            for j in range(2):
                for k in range(10):
                    tmp = ord(c[i]) + j
                    tmp = k - tmp
                    if tmp < 0:
                        dp[i][1] = min(dp[i][1], dp[i + 1][j] + tmp + 10 + k)
                    else:
                        dp[i][0] = min(dp[i][0], dp[i + 1][j] + tmp + k)

        print(dp[0][0])