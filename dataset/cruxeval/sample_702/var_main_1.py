def f(nums):
    count = len(nums)	## count = CLRJ | nums = CLRJ
    for i in range(len(nums) - 1, -1, -1):	## i = CLRJ | nums = CLRJ
        nums.insert(i, nums.pop(0))	## nums = CLRJ | i = CLRJ
    return nums	## nums = CLRJ
