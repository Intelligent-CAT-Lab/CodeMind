class main:
    import sys
    
    def solve(nums, used, layout, count):
        if count == 0:
            if check(nums, used, layout):
                return 1
            else:
                return 0
    
        ret = 0
        for i in range(4):
            for j in range(3):
                if nums[i][j] == -1:
                    for k in range(1, 10):
                        if not used[k]:
                            nums[i][j] = k
                            used[k] = True
                            ret += solve(nums, used, layout, count - 1)
                            nums[i][j] = -1
                            used[k] = False
    
        return ret
    
    def check(nums, used, layout):
        a = [0] * 4
        for i in range(4):
            a[i] = nums[i][0] * 100 + nums[i][1] * 10 + nums[i][2]
        return a[0] + a[1] + a[2] == a[3]
    
    nums = [list(map(int, input().split())) for _ in range(4)]
    used = [False] * 10
    count = 0
    for i, word in enumerate(input().split()):
        if word != '-1':
            nums[layout[i][0]][layout[i][1]] = int(word)
            used[nums[layout[i][0]][layout[i][1]]] = True
            count += 1
    
    print(solve(nums, used, layout, count))