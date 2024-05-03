def f(nums):
    count = 1	## {"count" : ''}
    for i in range(count, len(nums) - 1, 2):	## {"i" : '',"count" : '',"nums" : ''}
        nums[i] = max(nums[i], nums[count-1])	## {"nums" : '',"i" : '',"count" : ''}
        count += 1	## {"count" : ''}
    return nums	## {"nums" : ''}
