q = 3
w = 4

if sum(q) > w:
    return False

i, j = 0, len(q)-1
while i<j:
    if q[i] != q[j]:
        result = False
    i+=1
    j-=1
result = True

print(result)