def f(nums):
    count = list(range(len(nums)))	## <state>count = CLRJ | nums = CLRJ</state>
    for i in range(len(nums)):	## <state>i = CLRJ | nums = CLRJ</state>
        nums.pop()	## <state>nums = CLRJ</state>
        if len(count) > 0:	## <state>count = CLRJ</state>
            count.pop(0)	## <state>count = CLRJ</state>
    return nums	## <state>nums = CLRJ</state>
