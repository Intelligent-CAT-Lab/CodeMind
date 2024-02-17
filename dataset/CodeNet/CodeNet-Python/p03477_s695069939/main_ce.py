a, b, c, d = map(int, "3 8 7 1".split())
if (a + b) > (c + d):
    print('Left')
elif (a + b) < (c + d):
    print('Right')
else:
    print('Balanced')
