f, t = [int(i) for i in input().split()]
print(len([i for i in range(f, t+1) if str(i) == str(i)[::-1]]))