def f(base_list, nums):
    base_list.extend(nums)	## base_list = CLRJ | nums = CLRJ
    res = base_list.copy()	## res = CLRJ | base_list = CLRJ
    for i in range(-len(nums), 0):	## i = CLRJ | nums = CLRJ
        res.append(res[i])	## res = CLRJ | i = CLRJ
    return res	## res = CLRJ
