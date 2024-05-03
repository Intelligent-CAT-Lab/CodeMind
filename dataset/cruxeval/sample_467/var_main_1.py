def f(nums):
    copy = nums.copy()	## copy = CLRJ | nums = CLRJ
    newDict = dict()	## newDict = CLRJ
    for k in copy:	## copy = CLRJ
        newDict[k] = len(copy[k])
    return newDict	## newDict = CLRJ
