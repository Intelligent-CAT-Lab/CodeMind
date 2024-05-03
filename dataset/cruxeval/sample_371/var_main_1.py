def f(nums):
    for odd in nums[:]:	## odd = CLRJ | nums = CLRJ
        if odd % 2 != 0:	## odd = CLRJ
            nums.remove(odd)	## nums = CLRJ | odd = CLRJ
    sum_ = 0	## sum_ = CLRJ
    for num in nums:	## num = CLRJ | nums = CLRJ
        sum_ += num	## sum_ = CLRJ | num = CLRJ
    return sum_	## sum_ = CLRJ
