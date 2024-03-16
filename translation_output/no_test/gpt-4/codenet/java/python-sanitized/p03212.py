from collections import deque

def add_char(s, location, c):
    return s[:location] + c + s[location:]

def main():
    N = int(input())
    count = 0
    queue = deque(['357', '375', '537', '573', '735', '753'])
    seen = set()
    ch = ['3', '5', '7']

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
                for j in ch:
                    temp = add_char(s, i, j)
                    if temp not in seen:
                        seen.add(temp)
                        queue.append(temp)
    print(count)

if __name__ == "__main__":
    main()