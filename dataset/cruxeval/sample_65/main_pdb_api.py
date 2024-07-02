def f(nums, index):
    return nums[index] % 42 + nums.pop(index) * 2
f([3, 2, 0, 3, 7], 3)