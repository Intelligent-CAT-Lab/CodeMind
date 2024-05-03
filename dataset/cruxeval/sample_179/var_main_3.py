def f(nums):
    # Pass in a copy to avoid modifying nums
    nums = nums[:]	## <state>nums = CLRJ</state>
    count = len(nums)	## <state>count = CLRJ | nums = CLRJ</state>
    for i in range(-count+1, 0):	## <state>i = CLRJ | count = CLRJ</state>
        nums.insert(0, nums[i])	## <state>nums = CLRJ | i = CLRJ</state>
    return nums	## <state>nums = CLRJ</state>
