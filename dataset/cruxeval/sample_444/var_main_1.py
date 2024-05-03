def f(nums):
    count = len(nums)	## count = CLRJ | nums = CLRJ
    for i in range(count-1, 0, -2):	## i = CLRJ | count = CLRJ
        nums.insert(i, nums.pop(0) + nums.pop(0))	## nums = CLRJ | i = CLRJ
    return nums	## nums = CLRJ
