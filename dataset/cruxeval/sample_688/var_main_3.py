def f(nums):
    l = []	## <state>l = CLRJ</state>
    for i in nums:	## <state>i = CLRJ | nums = CLRJ</state>
        if i not in l:	## <state>i = CLRJ | l = CLRJ</state>
            l.append(i)	## <state>l = CLRJ | i = CLRJ</state>
    return l	## <state>l = CLRJ</state>
