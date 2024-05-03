def f(nums):
    count = len(nums)	## <state>count = CLRJ | nums = CLRJ</state>
    for i in range(len(nums) - 1, -1, -1):	## <state>i = CLRJ | nums = CLRJ</state>
        nums.insert(i, nums.pop(0))	## <state>nums = CLRJ | i = CLRJ</state>
    return nums	## <state>nums = CLRJ</state>
