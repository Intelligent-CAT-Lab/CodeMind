def f(nums):
    count = len(nums)	## <state>count = CLRJ | nums = CLRJ</state>
    for i in [i % 2 for i in range(count)]:	## <state>i = CLRJ | count = CLRJ</state>
        nums.append(nums[i])	## <state>nums = CLRJ | i = CLRJ</state>
    return nums	## <state>nums = CLRJ</state>
