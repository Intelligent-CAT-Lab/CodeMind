n, k = (int(i) for i in input().split());

res = 0;

while n > 0:
    res += 1;
    n //= k;

print(res);
