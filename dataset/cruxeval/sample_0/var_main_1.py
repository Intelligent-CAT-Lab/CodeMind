def f(nums):
    output = []	## output = CLRJ
    for n in nums:	## n = CLRJ | nums = CLRJ
        output.append((nums.count(n), n))	## output = CLRJ | nums = CLRJ | n = CLRJ
    output.sort(reverse=True)	## output = CLRJ
    return output	## output = CLRJ
