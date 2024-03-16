import sys

def ni(st):
    return int(st.nextToken())

def nia(N):
    st = nl()
    A = [ni(st) for _ in range(N)]
    return A

def setIO(s=''):
    sys.stdin = open(s + '.in', 'r')
    sys.stdout = open(s + '.out', 'w')

def main():
    setIO()
    N = int(input())
    l = len(str(N))
    m = 0
    for i in range(l):
        m = (10 * m + 7) % N

    i = l
    vis = [False] * N

    while True:
        if vis[m]:
            print(-1)
            break
        
        vis[m] = True
        
        if m == 0:
            print(i)
            break
        
        m = (10 * m + 7) % N
        i += 1

    sys.stdin.close()
    sys.stdout.close()

if __name__ == '__main__':
    main()