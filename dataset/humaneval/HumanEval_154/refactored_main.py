a = "xyzw"
b = "xyw"
l = len(b)
pat = b + b
for i in range(len(a) - l + 1):
    for j in range(l + 1):
        if a[i:i+l] == pat[j:j+l]:
            result = True
print(result)