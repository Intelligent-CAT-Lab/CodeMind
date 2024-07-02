def f(nums):
    count = len(nums)
    for i in range(count-1, 0, -2):
        nums.insert(i, nums.pop(0) + nums.pop(0))
    return nums
f([-5, 3, -2, -3, -1, 3, 5])