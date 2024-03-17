n = input()

for i in range(1, len(n)):
    if n[i] != '0':
        sum = 0
        for j in range(len(n)):
            sum += int(n[j])
        print(sum)
        return

if n[0] == '1':
    print(10)
    return

print(n[0])