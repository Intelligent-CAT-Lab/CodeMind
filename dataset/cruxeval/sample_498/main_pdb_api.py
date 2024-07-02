def f(nums, idx, added):
    nums[idx:idx] = (added,)
    return nums
f([2, 2, 2, 3, 3], 2, 3)