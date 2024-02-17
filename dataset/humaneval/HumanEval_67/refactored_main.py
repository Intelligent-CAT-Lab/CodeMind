s = "5 apples and 6 oranges"
n = 19
lis = list()
for i in s.split(' '):
    if i.isdigit():
        lis.append(int(i))
print(n - sum(lis))