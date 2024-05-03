def f(nums, val):
    new_list = []	## new_list = CLRJ
    [new_list.extend([i] * val) for i in nums]	## new_list = CLRJ | i = CLRJ | val = CLRJ | nums = CLRJ
    return sum(new_list)	## new_list = CLRJ
