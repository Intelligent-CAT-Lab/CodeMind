def f(nums, start, k):
    nums[start:start+k] = nums[start:start + k][::-1]	## <state>nums = CLRJ | start = CLRJ | k = CLRJ</state>
    return nums	## <state>nums = CLRJ</state>
