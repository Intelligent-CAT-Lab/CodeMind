string = 'caabcfcabfc'
sep = 'ab'
cnt = string.count(sep)
print(((string + sep) * cnt)[::-1])