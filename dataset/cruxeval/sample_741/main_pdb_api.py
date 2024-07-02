def f(nums, p):
    prev_p = p - 1
    if prev_p < 0: prev_p = len(nums) - 1
    return nums[prev_p]
f([6, 8, 2, 5, 3, 1, 9, 7], 6)