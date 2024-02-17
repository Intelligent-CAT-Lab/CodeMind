a, b, c = map(int, "10 10 5".split())
t = 0
for loop in xrange(61):
    if t % 60 <= c <= t % 60 + a:
        print t / 60 * 60 + c
        break
    t += a + b
else:
    print -1