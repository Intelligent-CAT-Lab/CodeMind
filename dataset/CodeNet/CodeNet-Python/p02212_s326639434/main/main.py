a, b, c, d = list(map(int, input().split()))
x = [a+b-c-d, a+c-b-d, a+d-b-c, b+c-a-d, b+d-a-c, c+d-a-b]
print((min(list(map(abs, x)))))

