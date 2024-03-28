import sys

def add_char(s, location, c):
    sb = s[:location] + c + s[location:]
    return sb

def p03212():
    N = int(input())
    set = set()
    queue = [357, 375, 537, 573, 735, 753]
    count = 0
    ch = ['3','5','7']
    for s in queue:
        if int(s) <= N:
            count += 1
    if N < 1000:
        print(count)
        return
    while queue:
        s = queue.pop(0)
        if int(s) <= N:
            count += 1
            for i in range(len(s)):
                for j in range(len(ch)):
                    temp = add_char(s, i, ch[j])
                    if temp not in set:
                        set.add(temp)
                        queue.append(temp)
    print(count)

if __name__ == '__main__':
    p03212()