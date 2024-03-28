class main:
    def main():
        # Input reading equivalent in Python
        words = input().split()
    
        nums = [[-1] * 3 for _ in range(4)]
        used = [False] * 10
        count = 0
    
        for i, word in enumerate(words):
            n = int(word)
            if n != -1:
                used[n] = True
            else:
                count += 1
            nums[layout[i][0]][layout[i][1]] = n
    
        # Printing the result of solve
        print(solve(nums, used, count))
    
    
    def solve(nums, used, c):
        if c == 0:
            return 1 if check(nums) else 0
    
        ret = 0
    
        for i in range(4):
            for j in range(3):
                if nums[i][j] == -1:
                    for k in range(1, 10):
                        if not used[k]:
                            nums[i][j] = k
                            used[k] = True
                            ret += solve(nums, used, c - 1)
                            nums[i][j] = -1
                            used[k] = False
                    return ret
    
        return ret
    
    
    def check(nums):
        a = [0] * 4
        for i in range(4):
            a[i] = nums[i][0] * 100 + nums[i][1] * 10 + nums[i][2]
    
        return a[0] + a[1] + a[2] == a[3]
    
    
    # Tuple of tuples with the same layout as static int[][] layout in the Java code
    layout = (
        (0, 2),
        (1, 1), (1, 2),
        (2, 0), (2, 1), (2, 2),
        (3, 0), (3, 1), (3, 2),
    )
    
    # Standard guard for running the main function in Python
    if __name__ == "__main__":
        main()