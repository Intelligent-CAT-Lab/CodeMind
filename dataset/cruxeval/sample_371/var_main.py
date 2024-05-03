def f(nums):
    for odd in nums[:]:	## {"odd" : '',"nums" : ''}
        if odd % 2 != 0:	## {"odd" : ''}
            nums.remove(odd)	## {"nums" : '',"odd" : ''}
    sum_ = 0	## {"sum_" : ''}
    for num in nums:	## {"num" : '',"nums" : ''}
        sum_ += num	## {"sum_" : '',"num" : ''}
    return sum_	## {"sum_" : ''}
