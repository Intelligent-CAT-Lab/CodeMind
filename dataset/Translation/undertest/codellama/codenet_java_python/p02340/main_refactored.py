class main:
    import sys
    import math
    
    BIG_NUM = 2000000000
    MOD = 1000000007
    HUGE_NUM = 99999999999999999
    EPS = 0.000000001
    
    SIZE = 1005
    dp = [[-1 for _ in range(SIZE)] for _ in range(SIZE)]
    
    def main():
        num_ball, num_box = map(int, sys.stdin.readline().split())
        print(recursive(num_ball, num_box))
    
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
    
    if __name__ == "__main__":
        main()