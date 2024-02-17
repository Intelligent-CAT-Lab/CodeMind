x = int("7")
N = 2*(x//11)
if x % 11 ==0:
    pass
elif x % 11 <= 6:
    N += 1
else:
    N += 2
print(N)