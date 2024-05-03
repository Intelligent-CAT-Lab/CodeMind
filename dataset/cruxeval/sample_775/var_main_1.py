def f(nums):
    count = len(nums)	## count = CLRJ | nums = CLRJ
    for i in range(0, count // 2):	## i = CLRJ | count = CLRJ
        nums[i], nums[count-i-1] = nums[count-i-1], nums[i]	## nums = CLRJ | i = CLRJ | count = CLRJ
    return nums	## nums = CLRJ
