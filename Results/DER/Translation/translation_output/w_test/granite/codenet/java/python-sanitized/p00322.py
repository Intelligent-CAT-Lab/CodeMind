import itertools

def alphametic(nums):
    nums = [int(n) for n in nums]
    used = [False] * 10
    count = nums.count(-1)

    def solve(c):
        if c == 0:
            if check(nums):
                return 1
            else:
                return 0
        ret = 0
        for i in range(4):
            for j in range(3):
                if nums[i * 3 + j] == -1:
                    for k in range(1, 10):
                        if not used[k]:
                            nums[i * 3 + j] = k
                            used[k] = True
                            ret += solve(c - 1)
                            nums[i * 3 + j] = -1
                            used[k] = False
                    break
        return ret

    def check(nums):
        a = [nums[0] * 100 + nums[1] * 10 + nums[2],
             nums[3] * 100 + nums[4] * 10 + nums[5],
             nums[6] * 100 + nums[7] * 10 + nums[8],
             nums[9] * 100 + nums[10] * 10 + nums[11]]
        return a[0] + a[1] + a[2] == a[3]

    return solve(count)

nums = [7, 6, -1, 1, -1, 9, 2, 3, 4]
print(alphametic(nums))