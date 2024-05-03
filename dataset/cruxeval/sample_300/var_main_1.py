def f(nums):
    count = 1	## count = CLRJ
    for i in range(count, len(nums) - 1, 2):	## i = CLRJ | count = CLRJ | nums = CLRJ
        nums[i] = max(nums[i], nums[count-1])	## nums = CLRJ | i = CLRJ | count = CLRJ
        count += 1	## count = CLRJ
    return nums	## nums = CLRJ
