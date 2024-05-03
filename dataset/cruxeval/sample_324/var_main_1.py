def f(nums):
    asc, desc = nums.copy(), []	## asc = CLRJ | desc = CLRJ | nums = CLRJ
    asc.reverse()	## asc = CLRJ
    desc = asc[:len(asc)//2]	## desc = CLRJ | asc = CLRJ
    return desc + asc + desc	## desc = CLRJ | asc = CLRJ
