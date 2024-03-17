import sys

def main():
    a, b, c, d = map(int, sys.stdin.readline().split())
    array = [0] * 101
    
    for i in range(a, b):
        array[i] += 1
        
    for i in range(c, d):
        array[i] += 1
        
    ans = sum(1 for i in range(101) if array[i] == 2)
    
    print(ans)

if __name__ == "__main__":
    main()