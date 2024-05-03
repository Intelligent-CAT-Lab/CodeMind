def f(nums):
    count = 1	## <state>count = CLRJ</state>
    for i in range(count, len(nums) - 1, 2):	## <state>i = CLRJ | count = CLRJ | nums = CLRJ</state>
        nums[i] = max(nums[i], nums[count-1])	## <state>nums = CLRJ | i = CLRJ | count = CLRJ</state>
        count += 1	## <state>count = CLRJ</state>
    return nums	## <state>nums = CLRJ</state>
