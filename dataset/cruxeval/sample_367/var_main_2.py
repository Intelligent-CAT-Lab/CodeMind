def f(nums, rmvalue):
    res = nums[:]	## res = [] | nums = []
    while rmvalue in res:	## rmvalue = [] | res = []
        popped = res.pop(res.index(rmvalue))
        if popped != rmvalue:
            res.append(popped)
    return res	## res = []
