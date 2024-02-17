a = 'unrndqafi'
b = 'c'
n = 2

result = m = b
for _ in range(n):
    if m:
        a, m = a.replace(m, '', 1), None
        result = m = b
print(result.join(a.split(b)))