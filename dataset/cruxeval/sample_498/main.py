def f(nums, idx, added):
    nums[idx:idx] = (added,)
    return nums