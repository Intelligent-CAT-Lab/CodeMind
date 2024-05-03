def f(nums, n):
    pos = len(nums) - 1	## {"pos" : '',"nums" : ''}
    for i in range(-len(nums), 0):	## {"nums" : ''}
        nums.insert(pos, nums[i])
    return nums	## {"nums" : ''}
