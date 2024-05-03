def f(nums):
    for i in range(len(nums) - 1, -1, -3):	## {"i" : '',"nums" : ''}
        if nums[i] == 0:	## {"nums" : '',"i" : ''}
            nums.clear()	## {"nums" : ''}
            return False
    return nums