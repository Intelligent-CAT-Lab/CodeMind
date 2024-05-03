def f(nums, p):
    prev_p = p - 1	## {"prev_p" : '',"p" : ''}
    if prev_p < 0: prev_p = len(nums) - 1	## {"prev_p" : '',"nums" : ''}
    return nums[prev_p]	## {"nums" : '',"prev_p" : ''}
