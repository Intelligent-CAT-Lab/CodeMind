import sys

def main():
    n = int(sys.stdin.readline())
    square = n * n
    odd = [i for i in range(1, square + 1) if i % 2 != 0]
    even = [i for i in range(1, square + 1) if i % 2 == 0]
    
    loop = square // n
    div = loop // 2
    
    for i in range(1, loop + 1):
        for j in range(div):
            if i % 2 == 1:
                print(odd.pop(0), end=' ')
                print(even.pop(), end=' ')
            else:
                print(even.pop(0), end=' ')
                print(odd.pop(), end=' ')
        print()

if __name__ == "__main__":
    main()