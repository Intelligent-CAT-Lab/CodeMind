s = '01,001'
nums = ''.join(filter(lambda c:c.isdecimal(), s))
if nums == '':
    result = 'none'
else:
    m = max([int(num) for num in nums.split(',')])
    result = str(m)
print(result)