def f(nums):
    middle = len(nums)//2
    return nums[middle:] + nums[0:middle]