def f(nums):
    count = len(nums)	## count = CLRJ | nums = CLRJ
    for i in range(0, count):	## i = CLRJ | count = CLRJ
        nums.insert(i, nums[i]*2)	## nums = CLRJ | i = CLRJ
    return nums	## nums = CLRJ
