import sys

def p04012():
    w = sys.stdin.readline().strip()
    c = list(w)
    a = 'a'
    z = 'z'
    count = 0
    for i in range(ord(a), ord(z) + 1):
        for x in c:
            if x == chr(i):
                count += 1
        if count % 2 == 1:
            print("No")
            return
        count = 0
    print("Yes")

p04012()