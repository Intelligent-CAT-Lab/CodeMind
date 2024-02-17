s = 'abba'
o = 'bab'
result = None
if s.startswith(o):
    result = s
else:
    result = o + f(s, o[-2::-1])
print(result)