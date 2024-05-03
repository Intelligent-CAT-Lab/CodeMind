def f(nums):
    for i in range(len(nums)-1, -1, -1):	## <state>i = CLRJ | nums = CLRJ</state>
        if nums[i] % 2 == 1:	## <state>nums = CLRJ | i = CLRJ</state>
            nums.insert(i+1, nums[i])	## <state>nums = CLRJ | i = CLRJ</state>
    return nums	## <state>nums = CLRJ</state>
