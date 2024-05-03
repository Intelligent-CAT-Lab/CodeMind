def f(nums):
    # Pass in a copy to avoid modifying nums
    nums = nums[:]	## {"nums" : ''}
    count = len(nums)	## {"count" : '',"nums" : ''}
    for i in range(-count+1, 0):	## {"i" : '',"count" : ''}
        nums.insert(0, nums[i])	## {"nums" : '',"i" : ''}
    return nums	## {"nums" : ''}
