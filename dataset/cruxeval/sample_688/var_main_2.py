def f(nums):
    l = []	## l = []
    for i in nums:	## i = [] | nums = []
        if i not in l:	## i = [] | l = []
            l.append(i)	## l = [] | i = []
    return l	## l = []
