total = [1, 2, 3]
arg = 'nammo'
if type(arg) is list:
    for e in arg:
        total.extend(e)
else:
    total.extend(arg)
print(total)