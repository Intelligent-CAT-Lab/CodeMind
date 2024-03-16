# Python code

tail = input()
n = len(tail)
count = 0

for i in range(n):
    if i % 2 == 0 and tail[i] == '0':
        count += 1
    if i % 2 == 1 and tail[i] == '1':
        count += 1

n -= count

if count > n:
    print(n)
else:
    print(count)