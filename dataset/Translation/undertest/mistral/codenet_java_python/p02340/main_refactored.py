class main:
    import sys
    
    def recursive(num_ball, num_box):
        if dp[num_ball][num_box] != -1:
            return dp[num_ball][num_box]
        if num_ball == 0:
            return 1
        if num_box == 1:
            return 1
        ret = 0
        for next_box in range(1, num_box+1):
            next_ball = num_ball-next_box
            if next_ball < 0:
                break
            ret += recursive(next_ball, next_box)
            ret %= 1000000007
        return dp[num_ball][num_box] = ret
    
    SIZE = 1005
    dp = [[-1 for _ in range(SIZE)] for _ in range(SIZE)]
    
    num_ball = int(input())
    num_box = int(input())
    
    print(recursive(num_ball, num_box))