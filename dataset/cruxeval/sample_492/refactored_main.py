text = 'abbkebaniuwurzvr'
value = 'm'
ls = list(text)
if (ls.count(value)) % 2 == 0:
    while value in ls:
        ls.remove(value)
else:
    ls.clear()
print(''.join(ls))