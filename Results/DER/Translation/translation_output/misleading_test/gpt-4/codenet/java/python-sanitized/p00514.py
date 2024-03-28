import math

def main():
    inp = input().split()
    a = int(inp[0])
    b = int(inp[1])
    c = int(inp[2])
    
    if a * b > c:
        print(0)
        return
    
    c -= a * b
    d = c + a - 1
    bi = 1
    for i in range(c):
        bi *= d - i
        bi //= i + 1
    
    print(bi)

if __name__ == "__main__":
    main()