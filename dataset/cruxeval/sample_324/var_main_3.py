def f(nums):
    asc, desc = nums.copy(), []	## <state>asc = CLRJ | desc = CLRJ | nums = CLRJ</state>
    asc.reverse()	## <state>asc = CLRJ</state>
    desc = asc[:len(asc)//2]	## <state>desc = CLRJ | asc = CLRJ</state>
    return desc + asc + desc	## <state>desc = CLRJ | asc = CLRJ</state>
