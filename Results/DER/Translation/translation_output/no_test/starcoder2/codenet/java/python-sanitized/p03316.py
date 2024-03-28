n = int(input())
a = sum(map(int, str(n)))
if n % a == 0:
    print("Yes")
else:
    print("No")