def f(nums, rmvalue):
    res = nums[:]	## <state>res = CLRJ | nums = CLRJ</state>
    while rmvalue in res:	## <state>rmvalue = CLRJ | res = CLRJ</state>
        popped = res.pop(res.index(rmvalue))
        if popped != rmvalue:
            res.append(popped)
    return res	## <state>res = CLRJ</state>
