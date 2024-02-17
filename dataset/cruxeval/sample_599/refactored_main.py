a = ["a", "b", "c"]
b = " "
a = b.join(a)
lst = []
for i in range(1, len(a)+1, 2):
    lst.append(a[i-1:][:i])
    lst.append(a[i-1:][i:])
print(lst)