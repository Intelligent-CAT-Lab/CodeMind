from collections import deque

def addChar(s, location, c):
    return s[:location] + c + s[location:]

def main():
    N = int(input())
    queue = deque(["357", "375", "537", "573", "735", "753"])
    count = 0
    chars = {'3', '5', '7'}
    if N < 1000:
        for s in queue:
            if int(s) <= N:
                count += 1
        print(count)
        return
    while queue:
        s = queue.popleft()
        if int(s) <= N:
            count += 1
            for i in range(len(s) + 1):
                for c in chars:
                    temp = addChar(s, i, c)
                    if temp not in queue:
                        queue.append(temp)
    print(count)

if __name__ == "__main__":
    main()