import sys

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

    return dp[num_ball][num_box] = ret

def gcd(x, y):
    x = abs(x)
    y = abs(y)

    if x < y:
        x, y = y, x

    if y == 0:
        return x
    else:
        return gcd(y, x % y)

def lcm(x, y):
    return (x * y) // gcd(x, y)

def getNUM(tmp_str):
    return int(tmp_str)

def isNumber(tmp_str):
    if tmp_str is None or len(tmp_str) == 0:
        return False

    pattern = re.compile(r'\A[0-9]+\z')
    matcher = pattern.match(tmp_str)
    return matcher is not None

if __name__ == "__main__":
    num_ball = int(sys.stdin.readline())
    num_box = int(sys.stdin.readline())

    print(recursive(num_ball, num_box))