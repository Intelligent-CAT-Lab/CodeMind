class main:
    def p02149():
        nums = list(map(int, input().split()))
        max_num = max(nums)
        idx = nums.index(max_num)
        print(chr(ord('A') + idx))
    
    p02149()