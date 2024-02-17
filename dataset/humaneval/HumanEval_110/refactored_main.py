lst1 = [1, 2, 3, 4]
lst2 = [1, 2, 3, 4]

odd = 0
even = 0
for i in lst1:
    if i%2 == 1:
        odd += 1
for i in lst2:
    if i%2 == 0:
        even += 1

if even >= odd:
    print("YES")
else:
    print("NO")