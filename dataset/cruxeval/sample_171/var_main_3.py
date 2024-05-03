def f(nums):
    count = len(nums) // 2	## <state>count = CLRJ | nums = CLRJ</state>
    for _ in range(count):	## <state>_ = CLRJ | count = CLRJ</state>
        nums.pop(0)	## <state>nums = CLRJ</state>
    return nums	## <state>nums = CLRJ</state>
