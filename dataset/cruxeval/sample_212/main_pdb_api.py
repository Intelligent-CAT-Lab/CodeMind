def f(nums):
    for _ in range(len(nums) - 1):
        nums.reverse()
    return nums
f([1, -9, 7, 2, 6, -3, 3])