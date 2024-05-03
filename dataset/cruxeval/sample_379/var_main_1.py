def f(nums):
    for i in range(len(nums) - 1, -1, -3):	## i = CLRJ | nums = CLRJ
        if nums[i] == 0:	## nums = CLRJ | i = CLRJ
            nums.clear()	## nums = CLRJ
            return False
    return nums