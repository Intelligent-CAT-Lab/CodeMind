h, a, b = map(int, "100 2 4".split())
print([(h%(a+c)==0) for c in range(b-a+1)].count(True))
