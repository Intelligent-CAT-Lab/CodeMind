def f(nums, rmvalue):
    res = nums[:]	## res = CLRJ | nums = CLRJ
    while rmvalue in res:	## rmvalue = CLRJ | res = CLRJ
        popped = res.pop(res.index(rmvalue))
        if popped != rmvalue:
            res.append(popped)
    return res	## res = CLRJ
