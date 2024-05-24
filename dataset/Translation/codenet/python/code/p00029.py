a = list(input().split())
print(max(a, key=a.count), max(a, key=len))
