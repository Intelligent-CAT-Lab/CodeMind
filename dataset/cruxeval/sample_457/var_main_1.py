def f(nums):
    count = list(range(len(nums)))	## count = CLRJ | nums = CLRJ
    for i in range(len(nums)):	## i = CLRJ | nums = CLRJ
        nums.pop()	## nums = CLRJ
        if len(count) > 0:	## count = CLRJ
            count.pop(0)	## count = CLRJ
    return nums	## nums = CLRJ
