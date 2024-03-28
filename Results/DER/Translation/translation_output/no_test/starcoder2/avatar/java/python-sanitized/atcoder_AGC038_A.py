h, w, a, b = map(int, input().split())

for i in range(h):
    for j in range(w):
        if j < a ^ i < b:
            x = 1
        else:
            x = 0
        print(x, end='')
    print()