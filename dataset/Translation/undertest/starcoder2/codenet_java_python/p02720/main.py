import sys

def main():
    k = int(sys.stdin.readline())
    list = [1, 2, 3, 4, 5, 6, 7, 8, 9]
    val = -1
    while k > 0:
        val = list[0]
        list.pop(0)
        if val % 10 != 0:
            list.append(10*val + val%10 - 1)
        list.append(10*val + val%10)
        if val % 10 != 9:
            list.append(10*val + val%10 + 1)
        k -= 1
    print(val)

if __name__ == '__main__':
    main()