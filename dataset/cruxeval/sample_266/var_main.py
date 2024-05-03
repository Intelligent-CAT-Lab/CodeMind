def f(nums):
    for i in range(len(nums)-1, -1, -1):	## {"i" : '',"nums" : ''}
        if nums[i] % 2 == 1:	## {"nums" : '',"i" : ''}
            nums.insert(i+1, nums[i])	## {"nums" : '',"i" : ''}
    return nums	## {"nums" : ''}
