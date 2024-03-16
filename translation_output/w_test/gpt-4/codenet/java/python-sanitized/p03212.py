from collections import deque

def add_char(s, location, c):
    return s[:location] + c + s[location:]

def main():
    N = int(input())
    seen = set()
    queue = deque()
    count = 0
    initial_values = ["357", "375", "537", "573", "735", "753"]
    
    for value in initial_values:
        if int(value) <= N:
            count += 1
        queue.append(value)

    if N < 1000:
        print(count)
        return

    chars = ['3', '5', '7']    
    while queue:
        s = queue.popleft()
        if int(s) <= N:
            count += 1
            for i in range(len(s) + 1):
                for ch in chars:
                    temp = add_char(s, i, ch)
                    if temp not in seen:
                        seen.add(temp)
                        queue.append(temp)
    
    print(count)

if __name__ == '__main__':
    main()