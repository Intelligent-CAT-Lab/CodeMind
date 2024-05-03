def f(nums, start, k):
    nums[start:start+k] = nums[start:start + k][::-1]	## nums = CLRJ | start = CLRJ | k = CLRJ
    return nums	## nums = CLRJ
