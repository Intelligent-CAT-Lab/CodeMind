s = "abcde"
c = "ae"
s = ''.join([char for char in s if char not in c])
print((s,s[::-1] == s))