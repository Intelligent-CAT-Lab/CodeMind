import queue

def main():
    N = int(input())
    set = set()
    queue = queue.Queue()
    count = 0
    ch = ['3', '5', '7']
    queue.put('357')
    queue.put('375')
    queue.put('537')
    queue.put('573')
    queue.put('735')
    queue.put('753')
    if N < 1000:
        while not queue.empty():
            s = queue.get()
            if int(s) <= N:
                count += 1
        print(count)
        return
    while not queue.empty():
        s = queue.get()
        if int(s) <= N:
            count += 1
            for i in range(len(s) + 1):
                for j in range(len(ch)):
                    temp = add_char(s, i, ch[j])
                    if temp not in set:
                        set.add(temp)
                        queue.put(temp)
    print(count)

def add_char(s, location, c):
    return s[:location] + c + s[location:]

if __name__ == "__main__":
    main()