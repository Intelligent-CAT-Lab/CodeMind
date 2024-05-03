def f(nums):
    count = len(nums)	## <state>count = CLRJ | nums = CLRJ</state>
    for i in range(-count+1, 0):	## <state>i = CLRJ | count = CLRJ</state>
        nums.extend([nums[i], nums[i]])	## <state>nums = CLRJ | i = CLRJ</state>
    return nums	## <state>nums = CLRJ</state>
