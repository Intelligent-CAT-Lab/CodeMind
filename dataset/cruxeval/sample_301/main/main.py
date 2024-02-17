def f(nums):
    count = len(nums)
    for i in range(-count+1, 0):
        nums.extend([nums[i], nums[i]])
    return nums