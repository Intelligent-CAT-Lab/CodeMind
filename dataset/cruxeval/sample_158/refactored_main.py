arr = [3, 6, 4, -2, 5]
n = [item for item in arr if item%2 == 0]
m = n+arr
for i in m:
    if m.index(i) >= len(n):
        m.remove(i)
print(m)