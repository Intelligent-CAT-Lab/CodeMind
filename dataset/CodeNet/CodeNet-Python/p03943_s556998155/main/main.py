candy= list(map(int, input().split()))
candy.sort()
print(('Yes' if candy[0]+candy[1]==candy[2] else 'No'))