def f(nums):
    a = 0	## a = CLRJ
    for i in range(len(nums)):	## i = CLRJ | nums = CLRJ
        nums.insert(i, nums[a])	## nums = CLRJ | i = CLRJ | a = CLRJ
        a += 1	## a = CLRJ
    return nums	## nums = CLRJ
