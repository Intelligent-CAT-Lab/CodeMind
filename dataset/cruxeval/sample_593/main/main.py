def f(nums, n):
    pos = len(nums) - 1
    for i in range(-len(nums), 0):
        nums.insert(pos, nums[i])
    return nums