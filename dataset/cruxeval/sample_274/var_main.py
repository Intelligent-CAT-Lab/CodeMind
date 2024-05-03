def f(nums, target):
    count = 0	## {"count" : ''}
    for n1 in nums:	## {"n1" : '',"nums" : ''}
        for n2 in nums:	## {"n2" : '',"nums" : ''}
            count += (n1+n2==target)	## {"count" : '',"n1" : '',"n2" : '',"target" : ''}
    return count	## {"count" : ''}
