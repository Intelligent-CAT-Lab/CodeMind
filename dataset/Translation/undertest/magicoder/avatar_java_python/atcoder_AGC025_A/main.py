n = int(input())

for i in range(1, len(str(n))):
    if str(n)[i] != '0':
        sum = 0
        for j in range(len(str(n))):
            sum += int(str(n)[j])
        print(sum)
        break

if str(n)[0] == '1':
    print(10)
else:
    print(str(n)[0])