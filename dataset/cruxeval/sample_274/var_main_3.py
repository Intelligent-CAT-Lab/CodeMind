def f(nums, target):
    count = 0	## <state>count = CLRJ</state>
    for n1 in nums:	## <state>n1 = CLRJ | nums = CLRJ</state>
        for n2 in nums:	## <state>n2 = CLRJ | nums = CLRJ</state>
            count += (n1+n2==target)	## <state>count = CLRJ | n1 = CLRJ | n2 = CLRJ | target = CLRJ</state>
    return count	## <state>count = CLRJ</state>
