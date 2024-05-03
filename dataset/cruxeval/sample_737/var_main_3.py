def f(nums):
    counts = 0	## <state>counts = CLRJ</state>
    for i in nums:	## <state>i = CLRJ | nums = CLRJ</state>
        if str(i).isdecimal():	## <state>i = CLRJ</state>
            if counts == 0:	## <state>counts = CLRJ</state>
                counts += 1	## <state>counts = CLRJ</state>
    return counts	## <state>counts = CLRJ</state>
