class main:
    import sys
    
    nums = [[0, 0, 0] for _ in range(4)]
    used = [False] * 10
    
    layout = [
        [0, 2],
        [1, 1], [1, 2],
        [2, 0], [2, 1], [2, 2],
        [3, 0], [3, 1], [3, 2],
    ]
    
    def solve(c):
        if c == 0:
            return check()
    
        ret = 0
    
        for i in range(4):
            for j in range(3):
                if nums[i][j] == 0:
                    for k in range(1, 10):
                        if not used[k]:
                            nums[i][j] = k
                            used[k] = True
                            ret += solve(c - 1)
                            nums[i][j] = 0
                            used[k] = False
                    return ret
    
    def check():
        a = [0] * 4
    
        for i in range(4):
            a[i] = nums[i][0] * 100 + nums[i][1] * 10 + nums[i][2]
    
        return a[0] + a[1] + a[2] == a[3]
    
    def main():
        words = list(map(int, sys.stdin.readline().split()))
    
        count = 0
    
        for i in range(len(words)):
            n = words[i]
            if n != -1:
                used[n] = True
            else:
                count += 1
            nums[layout[i][0]][layout[i][1]] = n
    
        print(solve(count))
    
    if __name__ == "__main__":
        main()