def f(nums, start, k):
    nums[start:start+k] = nums[start:start + k][::-1]	## nums = [] | start = [] | k = []
    return nums	## nums = []
