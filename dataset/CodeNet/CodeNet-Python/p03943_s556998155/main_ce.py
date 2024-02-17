candy= list(map(int, "10 30 20".split()))
candy.sort()
print('Yes' if candy[0]+candy[1]==candy[2] else 'No')