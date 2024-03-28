from collections import deque

def addChar(s, location, c):
    return s[:location] + c + s[location:]

N = int(input())
queue = deque(["357", "375", "537", "573", "735", "753"])
count = 0
ch = ['3', '5', '7']

if N < 1000:
    for s in queue:
        if int(s) <= N:
            count += 1
    print(count)
else:
    while queue:
        s = queue.popleft()
        if int(s) <= N:
            count += 1
            for i in range(len(s)+1):
                for j in range(len(ch)):
                    temp = addChar(s, i, ch[j])
                    queue.append(temp)

    print(count)

# Test the solution with given input
# N = 575
# Expected output: 4