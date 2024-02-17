s = eval(input())

ans = 0
for i in s:
    if  i == '+':ans = ans +1
    if  i == '-':ans = ans -1

print(ans)
