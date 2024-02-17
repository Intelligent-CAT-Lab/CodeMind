def f(nums):
    l = []
    for i in nums:
        if i not in l:
            l.append(i)
    return l