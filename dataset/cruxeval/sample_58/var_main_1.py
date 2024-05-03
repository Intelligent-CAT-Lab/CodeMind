def f(nums):
    count = len(nums)	## count = CLRJ | nums = CLRJ
    for i in [i % 2 for i in range(count)]:	## i = CLRJ | count = CLRJ
        nums.append(nums[i])	## nums = CLRJ | i = CLRJ
    return nums	## nums = CLRJ
