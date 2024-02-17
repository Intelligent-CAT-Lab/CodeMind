SIZE = 4500
def main():
    N = int(input())
    for n in range(SIZE+1):
        if n*(n+1) < 2 * N <= (n+1)*(n+2):
            break
    n += 1
    d = n*(n+1)//2 - N
    for i in range(1, n+1):
        if i == d: continue
        print(i)
    return

if __name__ == '__main__':
    main()
