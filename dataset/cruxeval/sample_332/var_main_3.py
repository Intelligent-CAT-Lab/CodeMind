def f(nums):
    count = len(nums)	## <state>count = CLRJ | nums = CLRJ</state>
    if count == 0:	## <state>count = CLRJ</state>
        nums = [0] * int(nums.pop())
    elif count % 2 == 0:	## <state>count = CLRJ</state>
        nums.clear()	## <state>nums = CLRJ</state>
    else:
        del nums[:count//2:]
    return nums	## <state>nums = CLRJ</state>
