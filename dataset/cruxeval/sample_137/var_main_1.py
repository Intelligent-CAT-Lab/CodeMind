def f(nums):
    count = 0	## count = CLRJ
    for i in range(len(nums)):	## i = CLRJ | nums = CLRJ
        if len(nums) == 0:	## nums = CLRJ
            break
        if count % 2 == 0:	## count = CLRJ
            nums.pop()	## nums = CLRJ
        else:
            nums.pop(0)	## nums = CLRJ
        count += 1	## count = CLRJ
    return nums	## nums = CLRJ
