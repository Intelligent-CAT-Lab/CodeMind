def f(nums, mos):
    for num in mos:	## num = CLRJ | mos = CLRJ
        nums.pop(nums.index(num))	## nums = CLRJ | num = CLRJ
    nums.sort()	## nums = CLRJ
    for num in mos:	## num = CLRJ | mos = CLRJ
        nums += [num]	## nums = CLRJ | num = CLRJ
    for i in range(len(nums)-1):	## i = CLRJ | nums = CLRJ
        if nums[i] > nums[i+1]:	## nums = CLRJ | i = CLRJ
            return False
    return True