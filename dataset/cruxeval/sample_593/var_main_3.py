def f(nums, n):
    pos = len(nums) - 1	## <state>pos = CLRJ | nums = CLRJ</state>
    for i in range(-len(nums), 0):	## <state>nums = CLRJ</state>
        nums.insert(pos, nums[i])
    return nums	## <state>nums = CLRJ</state>
