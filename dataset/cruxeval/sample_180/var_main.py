def f(nums):
    a = -1	## {"a" : ''}
    b = nums[1:]	## {"b" : '',"nums" : ''}
    while a <= b[0]:	## {"a" : '',"b" : ''}
        nums.remove(b[0])	## {"nums" : '',"b" : ''}
        a = 0	## {"a" : ''}
        b = b[1:]	## {"b" : ''}
    return nums	## {"nums" : ''}
