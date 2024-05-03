def f(nums, pos, value):
    nums.insert(pos, value)	## <state>nums = CLRJ | pos = CLRJ | value = CLRJ</state>
    return nums	## <state>nums = CLRJ</state>
