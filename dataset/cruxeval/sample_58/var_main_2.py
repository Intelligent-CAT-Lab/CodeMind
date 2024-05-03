def f(nums):
    count = len(nums)	## count = [] | nums = []
    for i in [i % 2 for i in range(count)]:	## i = [] | count = []
        nums.append(nums[i])	## nums = [] | i = []
    return nums	## nums = []
