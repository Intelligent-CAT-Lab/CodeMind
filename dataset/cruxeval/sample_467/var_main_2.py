def f(nums):
    copy = nums.copy()	## copy = [] | nums = []
    newDict = dict()	## newDict = []
    for k in copy:	## copy = []
        newDict[k] = len(copy[k])
    return newDict	## newDict = []
