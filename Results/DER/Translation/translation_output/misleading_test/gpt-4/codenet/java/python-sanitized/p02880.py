N = int(input())
f = False
for A in range(1, 10):
    if N % A == 0 and N // A < 10:
        f = True

ret = 'Yes' if f else 'No'
print(ret)