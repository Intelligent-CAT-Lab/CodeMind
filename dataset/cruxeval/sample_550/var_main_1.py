def f(nums):
    for i in range(len(nums)):	## i = CLRJ | nums = CLRJ
        nums.insert(i, nums[i]**2)	## nums = CLRJ | i = CLRJ
    return nums	## nums = CLRJ
