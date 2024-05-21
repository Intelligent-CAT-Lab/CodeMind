import sys

BIG_NUM = 2000000000
MOD = 1000000007
HUGE_NUM = 99999999999999999
EPS = 0.000000001

SIZE = 1005
dp = [[-1 for _ in range(SIZE)] for _ in range(SIZE)]

def recursive(num_ball, num_box):
    if dp[num_ball][num_box]!= -1:
        return dp[num_ball][num_box]
    if num_ball == 0:
        return 1
    if num_box == 1:
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
    num_ball, num_box = map(int, input().split())
    print(recursive(num_ball, num_box))

if __name__ == "__main__":
    main()