def f(nums):
    count = len(nums)	## count = CLRJ | nums = CLRJ
    for i in range(-count+1, 0):	## i = CLRJ | count = CLRJ
        nums.extend([nums[i], nums[i]])	## nums = CLRJ | i = CLRJ
    return nums	## nums = CLRJ
