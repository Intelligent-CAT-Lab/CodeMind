n, a, b = map(int, raw_input().split())

def doit(a, b, mask):
    differ = -1
    for i in range(n):
        if mask & (1 << i) == 0 and (a ^ b) & (1 << i) != 0:
            differ = i
    same = -1
    for i in range(n):
        if mask & (1 << i) == 0 and i != differ:
            same = i
    if same == -1:
        return [a, b]
    return (doit(a, a ^ (1 << same), mask | (1 << differ)) +
            doit(a ^ (1 << same) ^ (1 << differ), b, mask | (1 << differ)))

if bin(a ^ b).count('1') % 2 != 1:
    print "NO"
else:
    print "YES"
    ret = doit(a, b, 0)
    print " ".join(map(str, ret))