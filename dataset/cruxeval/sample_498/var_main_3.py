def f(nums, idx, added):
    nums[idx:idx] = (added,)	## <state>nums = CLRJ | idx = CLRJ | added = CLRJ</state>
    return nums	## <state>nums = CLRJ</state>
