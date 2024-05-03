def f(nums):
    count = list(range(len(nums)))	## {"count" : '',"nums" : ''}
    for i in range(len(nums)):	## {"i" : '',"nums" : ''}
        nums.pop()	## {"nums" : ''}
        if len(count) > 0:	## {"count" : ''}
            count.pop(0)	## {"count" : ''}
    return nums	## {"nums" : ''}
