def f(nums):
    count = 0	## {"count" : ''}
    for i in range(len(nums)):	## {"i" : '',"nums" : ''}
        if len(nums) == 0:	## {"nums" : ''}
            break
        if count % 2 == 0:	## {"count" : ''}
            nums.pop()	## {"nums" : ''}
        else:
            nums.pop(0)	## {"nums" : ''}
        count += 1	## {"count" : ''}
    return nums	## {"nums" : ''}
