def f(nums):
    count = 0	## <state>count = CLRJ</state>
    for i in range(len(nums)):	## <state>i = CLRJ | nums = CLRJ</state>
        if len(nums) == 0:	## <state>nums = CLRJ</state>
            break
        if count % 2 == 0:	## <state>count = CLRJ</state>
            nums.pop()	## <state>nums = CLRJ</state>
        else:
            nums.pop(0)	## <state>nums = CLRJ</state>
        count += 1	## <state>count = CLRJ</state>
    return nums	## <state>nums = CLRJ</state>
