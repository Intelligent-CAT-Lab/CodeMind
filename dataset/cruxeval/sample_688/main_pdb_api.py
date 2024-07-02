def f(nums):
    l = []
    for i in nums:
        if i not in l:
            l.append(i)
    return l
f([3, 1, 9, 0, 2, 0, 8])