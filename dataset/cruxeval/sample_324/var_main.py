def f(nums):
    asc, desc = nums.copy(), []	## {"asc" : '',"desc" : '',"nums" : ''}
    asc.reverse()	## {"asc" : ''}
    desc = asc[:len(asc)//2]	## {"desc" : '',"asc" : ''}
    return desc + asc + desc	## {"desc" : '',"asc" : ''}
