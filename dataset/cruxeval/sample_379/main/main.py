def f(nums):
    for i in range(len(nums) - 1, -1, -3):
        if nums[i] == 0:
            nums.clear()
            return False
    return nums