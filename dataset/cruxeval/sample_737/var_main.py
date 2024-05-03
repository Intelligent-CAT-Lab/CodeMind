def f(nums):
    counts = 0	## {"counts" : ''}
    for i in nums:	## {"i" : '',"nums" : ''}
        if str(i).isdecimal():	## {"i" : ''}
            if counts == 0:	## {"counts" : ''}
                counts += 1	## {"counts" : ''}
    return counts	## {"counts" : ''}
