class main:
    import sys
    
    MOD = 1000000007
    
    def recursive(num_ball, num_box):
        if num_ball == 0:
            return 1
        if num_box == 1:
            return 1
        ret = 0
        for next_box in range(1, num_box+1):
            next_ball = num_ball - next_box
            if next_ball < 0:
                break
            ret += recursive(next_ball, next_box)
            ret %= MOD
        return ret
    
    def main():
        num_ball, num_box = map(int, sys.stdin.readline().split())
        print(recursive(num_ball, num_box))
    
    if __name__ == '__main__':
        main()