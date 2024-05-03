def f(nums):
    middle = len(nums)//2	## middle = CLRJ | nums = CLRJ
    return nums[middle:] + nums[0:middle]	## nums = CLRJ | middle = CLRJ
