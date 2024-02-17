from math import floor, ceil
value = "10"
if value.count('.') == 1:
    # remove trailing zeros
    while (value[-1] == '0'):
        value = value[:-1]

num = float(value)
if value[-2:] == '.5':
    if num > 0:
        res = ceil(num)
    else:
        res = floor(num)
elif len(value) > 0:
    res = int(round(num))
else:
    res = 0

print(res)