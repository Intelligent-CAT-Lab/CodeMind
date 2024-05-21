from collections import deque

def main():
    N = int(input())
    set_ = set()
    queue = deque(["357", "375", "537", "573", "735", "753"])
    count = 0
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
                for j in range(len(ch)):
                    temp = add_char(s, i, ch[j])
                    if temp not in set_:
                        set_.add(temp)
                        queue.append(temp)
    print(count)

def add_char(s, location, c):
    return s[:location] + c + s[location:]

if __name__ == "__main__":
    main()