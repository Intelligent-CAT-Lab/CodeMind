s = '.'
n = 0
c = '99'
width = len(c)*n
for _ in range(width - len(s)):
    s = c + s
print(s)