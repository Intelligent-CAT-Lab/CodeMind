def f(nums):
    count = len(nums)	## <state>count = CLRJ | nums = CLRJ</state>
    for i in range(count-1, 0, -2):	## <state>i = CLRJ | count = CLRJ</state>
        nums.insert(i, nums.pop(0) + nums.pop(0))	## <state>nums = CLRJ | i = CLRJ</state>
    return nums	## <state>nums = CLRJ</state>
