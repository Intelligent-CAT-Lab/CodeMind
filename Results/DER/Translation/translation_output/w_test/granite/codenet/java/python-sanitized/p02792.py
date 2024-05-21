import sys

def main():
    n = int(sys.stdin.readline())
    count = 0
    table = [[0 for _ in range(10)] for _ in range(10)]
    for i in range(1, n + 1):
        head = int(str(i)[0])
        tail = i % 10
        table[head][tail] += 1
    for i in range(1, n + 1):
        head = int(str(i)[0])
        tail = i % 10
        if tail == 0:
            continue
        count += table[tail][head]
    print(count)

if __name__ == '__main__':
    main()