def f(nums):
    middle = len(nums)//2
    return nums[middle:] + nums[0:middle]
f([1, 1, 1])