from collections import deque

def main():
    n = int(input())
    square = n * n
    odd = deque()
    even = deque()
    
    for i in range(1, square + 1):
        if i % 2 == 0:
            even.append(i)
        else:
            odd.append(i)
    
    loop = square // n
    div = loop // 2
    
    for i in range(1, loop + 1):
        for j in range(div):
            if i % 2 == 1:
                print(f"{odd.popleft()} {even.pop()}", end=" ")
            else:
                print(f"{even.popleft()} {odd.pop()}", end=" ")
        print()


if __name__ == "__main__":
    main()

# A sample test case provided to match the example in the Java code:
# Test input:
# 6

# Expected output:
# 1 36 3 34 5 32 
# 2 35 4 33 6 31 
# 7 30 9 28 11 26 
# 8 29 10 27 12 25 
# 13 24 15 22 17 20