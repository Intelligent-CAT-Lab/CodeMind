def f(nums):
    count = len(nums)	## <state>count = CLRJ | nums = CLRJ</state>
    for i in range(0, count):	## <state>i = CLRJ | count = CLRJ</state>
        nums.insert(i, nums[i]*2)	## <state>nums = CLRJ | i = CLRJ</state>
    return nums	## <state>nums = CLRJ</state>
