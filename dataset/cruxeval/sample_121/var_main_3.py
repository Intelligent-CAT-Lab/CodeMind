def f(s):
    nums = ''.join(filter(lambda c:c.isdecimal(), s))	## <state>nums = CLRJ | c = CLRJ | s = CLRJ</state>
    if nums == '': return 'none'	## <state>nums = CLRJ</state>
    m = max([int(num) for num in nums.split(',')])	## <state>m = CLRJ | num = CLRJ | nums = CLRJ</state>
    return str(m)	## <state>m = CLRJ</state>
