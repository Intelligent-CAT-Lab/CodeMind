test = 'ab cd'
sep = 'x'
maxsplit = 2
try:
    print(test.rsplit(sep, maxsplit))
except:
    print(test.rsplit())