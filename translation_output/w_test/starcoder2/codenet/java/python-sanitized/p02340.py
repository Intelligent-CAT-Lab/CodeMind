import sys

dp = [[-1 for i in range(1005)] for j in range(1005)]

def recursive(num_ball, num_box):
    if dp[num_ball][num_box] != -1:
        return dp[num_ball][num_box]
    if num_ball == 0:
        return 1
    elif num_box == 1:
        return 1
    ret = 0
    for next_box in range(1, num_box+1):
        next_ball = num_ball - next_box
        if next_ball < 0:
            break
        ret += recursive(next_ball, next_box)
        ret %= 1000000007
    return dp[num_ball][num_box] = ret

num_ball, num_box = map(int, sys.stdin.readline().split())
print(recursive(num_ball, num_box))