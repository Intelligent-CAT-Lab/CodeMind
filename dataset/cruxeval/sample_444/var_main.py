def f(nums):
    count = len(nums)	## {"count" : '',"nums" : ''}
    for i in range(count-1, 0, -2):	## {"i" : '',"count" : ''}
        nums.insert(i, nums.pop(0) + nums.pop(0))	## {"nums" : '',"i" : ''}
    return nums	## {"nums" : ''}
