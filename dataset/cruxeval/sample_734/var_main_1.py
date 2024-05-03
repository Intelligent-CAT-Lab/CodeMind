def f(nums):
    for i in range(len(nums) - 2, -1, -1):	## i = CLRJ | nums = CLRJ
        if nums[i] % 2 == 0:	## nums = CLRJ | i = CLRJ
            nums.remove(nums[i])
    return nums	## nums = CLRJ
