def f(nums):
    m = max(nums)
    for i in range(m):
        nums.reverse()
    return nums
f([43, 0, 4, 77, 5, 2, 0, 9, 77])