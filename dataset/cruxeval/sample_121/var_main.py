def f(s):
    nums = ''.join(filter(lambda c:c.isdecimal(), s))	## {"nums" : '',"c" : '',"s" : ''}
    if nums == '': return 'none'	## {"nums" : ''}
    m = max([int(num) for num in nums.split(',')])	## {"m" : '',"num" : '',"nums" : ''}
    return str(m)	## {"m" : ''}
