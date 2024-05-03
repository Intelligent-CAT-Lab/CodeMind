def f(nums, p):
    prev_p = p - 1	## <state>prev_p = CLRJ | p = CLRJ</state>
    if prev_p < 0: prev_p = len(nums) - 1	## <state>prev_p = CLRJ | nums = CLRJ</state>
    return nums[prev_p]	## <state>nums = CLRJ | prev_p = CLRJ</state>
