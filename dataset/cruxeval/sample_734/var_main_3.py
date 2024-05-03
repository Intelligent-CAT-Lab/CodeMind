def f(nums):
    for i in range(len(nums) - 2, -1, -1):	## <state>i = CLRJ | nums = CLRJ</state>
        if nums[i] % 2 == 0:	## <state>nums = CLRJ | i = CLRJ</state>
            nums.remove(nums[i])
    return nums	## <state>nums = CLRJ</state>
