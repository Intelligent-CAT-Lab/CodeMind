#C
x = int("7")
ans = x//11
if x - 11*ans > 6:
    print(2*ans+2)
elif x - 11*ans == 0:
    print(2*ans)
else:
    print(2*ans+1)