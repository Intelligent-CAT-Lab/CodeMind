def f(nums):
    count = len(nums)	## <state>count = CLRJ | nums = CLRJ</state>
    for i in range(0, count // 2):	## <state>i = CLRJ | count = CLRJ</state>
        nums[i], nums[count-i-1] = nums[count-i-1], nums[i]	## <state>nums = CLRJ | i = CLRJ | count = CLRJ</state>
    return nums	## <state>nums = CLRJ</state>
