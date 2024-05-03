def f(nums):
    for i in range(len(nums)):	## i = CLRJ | nums = CLRJ
        if nums[i] % 3 == 0:	## nums = CLRJ | i = CLRJ
            nums.append(nums[i])	## nums = CLRJ | i = CLRJ
    return nums	## nums = CLRJ
