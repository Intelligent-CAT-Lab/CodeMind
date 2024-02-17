def f(base_list, nums):
    base_list.extend(nums)
    res = base_list.copy()
    for i in range(-len(nums), 0):
        res.append(res[i])
    return res