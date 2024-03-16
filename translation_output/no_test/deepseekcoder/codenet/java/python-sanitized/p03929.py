import sys

def solve():
    one = nextIntArray()
    N = one[0]
    d = one[1]
    if N <= 2:
        myout(0)
        return
    N -= 3
    loop = N // 11
    amari = N % 11
    map = [[1,1,1,2,2,3,4,4,5,5,5], [0,1,2,2,3,3,3,4,4,4,5], [1,1,1,2,2,2,3,3,4,5,5],
           [0,0,1,1,2,3,3,4,4,4,5], [1,2,2,3,3,3,4,4,4,5,5], [0,0,1,1,1,2,2,3,4,4,5],
           [0,1,1,2,3,3,4,4,4,5,5], [1,1,2,2,2,3,3,3,4,4,5], [0,1,1,1,2,2,3,4,4,5,5],
           [1,1,2,3,3,4,4,4,5,5,5], [0,1,1,1,2,2,2,3,3,4,5]]
    myout(loop * 5 + map[d][amari])

def myout(t):
    print(t)

def nextIntArray():
    return list(map(int, input().split()))

def main():
    solve()

if __name__ == "__main__":
    main()