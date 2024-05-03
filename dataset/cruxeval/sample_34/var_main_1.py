def f(nums, odd1, odd2):
    while odd1 in nums:	## odd1 = CLRJ | nums = CLRJ
        nums.remove(odd1)	## nums = CLRJ | odd1 = CLRJ
    while odd2 in nums:	## odd2 = CLRJ | nums = CLRJ
        nums.remove(odd2)	## nums = CLRJ | odd2 = CLRJ
    return nums	## nums = CLRJ
