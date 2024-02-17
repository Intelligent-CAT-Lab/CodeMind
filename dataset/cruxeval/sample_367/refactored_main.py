nums = [6, 2, 1, 1, 4, 1]
rmvalue = 5
res = nums[:]
while rmvalue in res:
    popped = res.pop(res.index(rmvalue))
    if popped != rmvalue:
        res.append(popped)
print(res)