def f(nums):
    for i in range(len(nums) - 2, -1, -1):
        if nums[i] % 2 == 0:
            nums.remove(nums[i])
    return nums