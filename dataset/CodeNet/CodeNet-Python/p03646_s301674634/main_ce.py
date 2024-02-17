import sys
def main():
    input = sys.stdin.readline
    K=int("0")
    N=max(2,min(50,K))
    ans=[i+K//N for i in range(N)]
    m=K%N
    for i in range(m):
        for j in range(N):
            if i==j: ans[j]+=N
            else: ans[j]-=1
    print(N)
    print(*ans)
if __name__ == '__main__':
    main()