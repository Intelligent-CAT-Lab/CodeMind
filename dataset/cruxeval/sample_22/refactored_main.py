a = 000
if a == 0:
    print([0])
result = []
while a > 0:
    result.append(a%10)
    a = a//10
result.reverse()
print(int(''.join(str(i) for i in result)))