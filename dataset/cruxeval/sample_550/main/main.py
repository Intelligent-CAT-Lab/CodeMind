def f(nums):
    for i in range(len(nums)):
        nums.insert(i, nums[i]**2)
    return nums