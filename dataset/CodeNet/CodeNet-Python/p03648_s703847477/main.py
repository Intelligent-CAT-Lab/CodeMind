k = int(input())
n = 50
p = k // n
a = [i + p for i in range(n)]
m = k % n
for i in range(m) :
    a[i] += n
    for j in range(n) :
        if i != j :
            a[j] -= 1
print(n)
print(*a)