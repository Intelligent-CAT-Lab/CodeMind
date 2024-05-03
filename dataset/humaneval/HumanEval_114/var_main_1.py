def minSubArraySum(nums):
    max_sum = 0	## max_sum = CLRJ
    s = 0	## s = CLRJ
    for num in nums:	## num = CLRJ|nums = CLRJ
        s += -num	## s = CLRJ|num = CLRJ
        if (s < 0):	## s = CLRJ
            s = 0	## s = CLRJ
        max_sum = max(s, max_sum)	## max_sum = CLRJ|s = CLRJ
    if max_sum == 0:	## max_sum = CLRJ
        max_sum = max(-i for i in nums)	## max_sum = CLRJ|i = CLRJ|nums = CLRJ
    min_sum = -max_sum	## min_sum = CLRJ|max_sum = CLRJ
    return min_sum	## min_sum = CLRJ
