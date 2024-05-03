def f(nums, mos):
    for num in mos:	## {"num" : '',"mos" : ''}
        nums.pop(nums.index(num))	## {"nums" : '',"num" : ''}
    nums.sort()	## {"nums" : ''}
    for num in mos:	## {"num" : '',"mos" : ''}
        nums += [num]	## {"nums" : '',"num" : ''}
    for i in range(len(nums)-1):	## {"i" : '',"nums" : ''}
        if nums[i] > nums[i+1]:	## {"nums" : '',"i" : ''}
            return False
    return True