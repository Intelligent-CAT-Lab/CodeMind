def f(nums):
    for i in range(len(nums) - 2, -1, -1):	## {"i" : '',"nums" : ''}
        if nums[i] % 2 == 0:	## {"nums" : '',"i" : ''}
            nums.remove(nums[i])
    return nums	## {"nums" : ''}
