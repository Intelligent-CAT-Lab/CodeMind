a={1, 3, 5, 7, 8, 10, 12}
b={4, 6, 9, 11}
c={2}
x, y = list(map(int, input().split()))
print(('Yes' if (x in a and y in a) or (x in b and y in b) or (x in c and y in c) else 'No'))