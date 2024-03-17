n = int(input())
for i in range(1000000):
    if str(n-i) == str(n-i)[::-1]:
        print(n-i)
        break
    if str(n+i) == str(n+i)[::-1]:
        print(n+i)
        break