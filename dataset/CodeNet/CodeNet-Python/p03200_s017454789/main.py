s = input()
a = b = 0

for x in s:
    a += b*(x=="W")
    b += x=="B"
print(a)