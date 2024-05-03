def f(nums):
    for i in range(len(nums)-1, -1, -1):	## i = CLRJ | nums = CLRJ
        if nums[i] % 2 == 1:	## nums = CLRJ | i = CLRJ
            nums.insert(i+1, nums[i])	## nums = CLRJ | i = CLRJ
    return nums	## nums = CLRJ
