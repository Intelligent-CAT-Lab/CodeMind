def f(nums):
    for i in range(len(nums)):	## <state>i = CLRJ | nums = CLRJ</state>
        nums.insert(i, nums[i]**2)	## <state>nums = CLRJ | i = CLRJ</state>
    return nums	## <state>nums = CLRJ</state>
