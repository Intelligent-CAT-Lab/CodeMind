def f(nums):
    for i in range(len(nums) - 1, -1, -3):	## <state>i = CLRJ | nums = CLRJ</state>
        if nums[i] == 0:	## <state>nums = CLRJ | i = CLRJ</state>
            nums.clear()	## <state>nums = CLRJ</state>
            return False
    return nums