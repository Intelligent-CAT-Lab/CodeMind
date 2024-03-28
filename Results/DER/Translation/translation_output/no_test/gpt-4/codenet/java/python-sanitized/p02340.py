import re

# Constants
BIG_NUM = 2000000000
MOD = 1000000007
HUGE_NUM = 99999999999999999
EPS = 0.000000001

SIZE = 1005
dp = [[-1 for _ in range(SIZE)] for _ in range(SIZE)]

def recursive(num_ball, num_box):
    if dp[num_ball][num_box] != -1:
        return dp[num_ball][num_box]

    if num_ball == 0:
        return 1
    elif num_box == 1:
        return 1

    ret = 0
    for next_box in range(1, num_box + 1):
        next_ball = num_ball - next_box
        if next_ball < 0:
            break

        ret += recursive(next_ball, next_box)
        ret %= MOD

    dp[num_ball][num_box] = ret
    return ret

def main():
    num_ball = int(input())
    num_box = int(input())
    print(recursive(num_ball, num_box))

class UTIL:
    @staticmethod
    def gcd(x, y):
        x = abs(x)
        y = abs(y)
        if x < y:
            x, y = y, x

        if y == 0:
            return x
        else:
            return UTIL.gcd(y, x % y)

    @staticmethod
    def lcm(x, y):
        return (x * y) // UTIL.gcd(x, y)

    @staticmethod
    def getNUM(tmp_str):
        return int(tmp_str)

    @staticmethod
    def isNumber(tmp_str):
        if tmp_str is None or len(tmp_str) == 0:
            return False

        pattern = re.compile(r'\A[0-9]+\Z')
        return pattern.match(tmp_str) is not None

if __name__ == '__main__':
    main()