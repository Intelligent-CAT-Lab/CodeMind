n = int(input())

s_n = sum([int(i) for i in list(str(n))])

if n % s_n == 0:
    print("Yes")
else:
    print("No")
