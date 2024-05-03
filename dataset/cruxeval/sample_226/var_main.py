def f(nums):
    for i in range(len(nums)):	## {"i" : '',"nums" : ''}
        if nums[i] % 3 == 0:	## {"nums" : '',"i" : ''}
            nums.append(nums[i])	## {"nums" : '',"i" : ''}
    return nums	## {"nums" : ''}
