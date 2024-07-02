def f(nums, spot, idx):
    nums.insert(spot, idx)
    return nums
f([1, 0, 1, 1], 0, 9)