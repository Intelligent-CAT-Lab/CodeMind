import sys
A,B,C = map(int,"10 10 5".split())
time = 0
ss = set()
while True:
    if time%60 == C:
        print(time)
        sys.exit()
    for t in range(A):
        time += 1
        if time%60 == C:
            print(time)
            sys.exit()
    time += B
    if (time%60) in ss:
        break
    ss.add(time%60)
print(-1)