def f(nums):
    a = -1	## a = CLRJ
    b = nums[1:]	## b = CLRJ | nums = CLRJ
    while a <= b[0]:	## a = CLRJ | b = CLRJ
        nums.remove(b[0])	## nums = CLRJ | b = CLRJ
        a = 0	## a = CLRJ
        b = b[1:]	## b = CLRJ
    return nums	## nums = CLRJ
