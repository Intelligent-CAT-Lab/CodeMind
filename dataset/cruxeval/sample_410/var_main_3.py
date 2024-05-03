def f(nums):
    a = 0	## <state>a = CLRJ</state>
    for i in range(len(nums)):	## <state>i = CLRJ | nums = CLRJ</state>
        nums.insert(i, nums[a])	## <state>nums = CLRJ | i = CLRJ | a = CLRJ</state>
        a += 1	## <state>a = CLRJ</state>
    return nums	## <state>nums = CLRJ</state>
