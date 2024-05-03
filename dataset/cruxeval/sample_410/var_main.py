def f(nums):
    a = 0	## {"a" : ''}
    for i in range(len(nums)):	## {"i" : '',"nums" : ''}
        nums.insert(i, nums[a])	## {"nums" : '',"i" : '',"a" : ''}
        a += 1	## {"a" : ''}
    return nums	## {"nums" : ''}
