def f(base_list, nums):
    base_list.extend(nums)	## <state>base_list = CLRJ | nums = CLRJ</state>
    res = base_list.copy()	## <state>res = CLRJ | base_list = CLRJ</state>
    for i in range(-len(nums), 0):	## <state>i = CLRJ | nums = CLRJ</state>
        res.append(res[i])	## <state>res = CLRJ | i = CLRJ</state>
    return res	## <state>res = CLRJ</state>
