from collections import deque

def add_char(s, location, c):
    return s[:location] + c + s[location:]

def p03212(N):
    set_ = set()
    queue = deque(["357", "375", "537", "573", "735", "753"])
    count = 6
    ch = ['3', '5', '7']

    if N < 1000:
        return sum(1 for s in queue if int(s) <= N)

    while queue:
        s = queue.popleft()
        if int(s) <= N:
            count += 1
            for i in range(len(s) + 1):
                for c in ch:
                    temp = add_char(s, i, c)
                    if temp not in set_:
                        set_.add(temp)
                        queue.append(temp)
    return count

N = int(input())
print(p03212(N))