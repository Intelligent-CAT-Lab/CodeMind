def f(s):
    nums = ''.join(filter(lambda c:c.isdecimal(), s))	## nums = CLRJ | c = CLRJ | s = CLRJ
    if nums == '': return 'none'	## nums = CLRJ
    m = max([int(num) for num in nums.split(',')])	## m = CLRJ | num = CLRJ | nums = CLRJ
    return str(m)	## m = CLRJ
