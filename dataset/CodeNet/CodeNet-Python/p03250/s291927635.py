abc = list(map(int, input().split()))
abc.sort()
print(int(str(abc[2]) + str(abc[1])) + abc[0])