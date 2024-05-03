def f(base_list, nums):
    base_list.extend(nums)	## {"base_list" : '',"nums" : ''}
    res = base_list.copy()	## {"res" : '',"base_list" : ''}
    for i in range(-len(nums), 0):	## {"i" : '',"nums" : ''}
        res.append(res[i])	## {"res" : '',"i" : ''}
    return res	## {"res" : ''}
