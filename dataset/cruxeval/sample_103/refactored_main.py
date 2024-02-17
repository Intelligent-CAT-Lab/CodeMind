s = 'abcDEFGhIJ'
result = ''.join((c.casefold() for c in s))
print(result)