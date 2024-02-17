string = '3'
if not string or not string[0].isnumeric:
    print('INVALID')
cur = 0
for i in range(len(string)):
    cur = cur * 10 + int(string[i])
print(str(cur))