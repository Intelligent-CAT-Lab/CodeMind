def f(nums, odd1, odd2):
    while odd1 in nums:	## {"odd1" : '',"nums" : ''}
        nums.remove(odd1)	## {"nums" : '',"odd1" : ''}
    while odd2 in nums:	## {"odd2" : '',"nums" : ''}
        nums.remove(odd2)	## {"nums" : '',"odd2" : ''}
    return nums	## {"nums" : ''}
