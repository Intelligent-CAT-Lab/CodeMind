first = [1, 2, 1]
second = [1, 1, 2]
if len(first) < 10 or len(second) < 10:
    print('no')
for i in range(5):
    if first[i] != second[i]:
        print('no')
first.extend(second)
print(first)