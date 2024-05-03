def f(nums):
    counts = 0	## counts = CLRJ
    for i in nums:	## i = CLRJ | nums = CLRJ
        if str(i).isdecimal():	## i = CLRJ
            if counts == 0:	## counts = CLRJ
                counts += 1	## counts = CLRJ
    return counts	## counts = CLRJ
