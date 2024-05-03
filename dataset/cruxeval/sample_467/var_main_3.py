def f(nums):
    copy = nums.copy()	## <state>copy = CLRJ | nums = CLRJ</state>
    newDict = dict()	## <state>newDict = CLRJ</state>
    for k in copy:	## <state>copy = CLRJ</state>
        newDict[k] = len(copy[k])
    return newDict	## <state>newDict = CLRJ</state>
