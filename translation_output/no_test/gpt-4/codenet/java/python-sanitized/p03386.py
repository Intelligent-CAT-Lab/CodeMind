a = int(input())
b = int(input())
k = int(input())
my_set = set()

cnt = 0
for i in range(a, b + 1):
    if cnt >= k:
        break
    cnt += 1
    my_set.add(i)

cnt = 0
for i in range(b, a - 1, -1):
    if cnt >= k:
        break
    cnt += 1
    my_set.add(i)

for ans in sorted(my_set):
    print(ans)