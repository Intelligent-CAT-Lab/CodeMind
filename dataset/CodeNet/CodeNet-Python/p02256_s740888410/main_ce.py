a, b = map(int,"54 20".split())
def gcp(x, y):
    while min(x, y) != 0:
        if x < y:
            x, y = y, x
        x = x % y
    return max(x, y)
print(gcp(a,b))
