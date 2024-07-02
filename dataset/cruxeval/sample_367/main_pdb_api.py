def f(nums, rmvalue):
    res = nums[:]
    while rmvalue in res:
        popped = res.pop(res.index(rmvalue))
        if popped != rmvalue:
            res.append(popped)
    return res
f([6, 2, 1, 1, 4, 1], 5)