def f(nums, index):
    return nums[index] % 42 + nums.pop(index) * 2