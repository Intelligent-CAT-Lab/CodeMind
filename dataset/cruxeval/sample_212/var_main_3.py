def f(nums):
    for _ in range(len(nums) - 1):	## <state>_ = CLRJ | nums = CLRJ</state>
        nums.reverse()	## <state>nums = CLRJ</state>
    return nums	## <state>nums = CLRJ</state>
