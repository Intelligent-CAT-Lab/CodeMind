def f(nums):
    output = []	## output = []
    for n in nums:	## n = [] | nums = []
        output.append((nums.count(n), n))	## output = [] | nums = [] | n = []
    output.sort(reverse=True)	## output = []
    return output	## output = []
