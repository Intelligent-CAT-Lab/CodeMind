def f(nums):
    m = max(nums)
    for i in range(m):
        nums.reverse()
    return nums