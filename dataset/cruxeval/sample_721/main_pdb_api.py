def f(nums):
    count = len(nums)
    for num in range(2, count):
        nums.sort()
    return nums
f([-6, -5, -7, -8, 2])