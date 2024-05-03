def f(nums):
    for i in range(len(nums)):	## <state>i = CLRJ | nums = CLRJ</state>
        if nums[i] % 3 == 0:	## <state>nums = CLRJ | i = CLRJ</state>
            nums.append(nums[i])	## <state>nums = CLRJ | i = CLRJ</state>
    return nums	## <state>nums = CLRJ</state>
