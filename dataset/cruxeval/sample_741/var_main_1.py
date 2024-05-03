def f(nums, p):
    prev_p = p - 1	## prev_p = CLRJ | p = CLRJ
    if prev_p < 0: prev_p = len(nums) - 1	## prev_p = CLRJ | nums = CLRJ
    return nums[prev_p]	## nums = CLRJ | prev_p = CLRJ
