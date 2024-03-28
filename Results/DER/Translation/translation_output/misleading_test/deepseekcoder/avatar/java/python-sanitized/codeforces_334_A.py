import sys

def main():
    n = int(input())
    square = n * n
    odd = list(range(1, square + 1, 2))
    even = list(range(2, square + 1, 2))
    
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