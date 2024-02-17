def f(s):
    nums = ''.join([c for c in s if c.isdecimal()])
    if nums == '': return 'none'
    m = max([int(num) for num in nums.split(',')])
    return str(m)