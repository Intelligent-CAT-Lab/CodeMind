def f(nums, val):
    new_list = []	## {"new_list" : ''}
    [new_list.extend([i] * val) for i in nums]	## {"new_list" : '',"i" : '',"val" : '',"nums" : ''}
    return sum(new_list)	## {"new_list" : ''}
